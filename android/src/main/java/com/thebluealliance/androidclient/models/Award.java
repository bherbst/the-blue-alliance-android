package com.thebluealliance.androidclient.models;

import android.content.ContentValues;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.thebluealliance.androidclient.database.TbaDatabaseModel;
import com.thebluealliance.androidclient.database.tables.AwardsTable;
import com.thebluealliance.androidclient.interfaces.RenderableModel;
import com.thebluealliance.androidclient.listitems.ListElement;
import com.thebluealliance.androidclient.renderers.ModelRenderer;
import com.thebluealliance.androidclient.renderers.ModelRendererSupplier;
import com.thebluealliance.androidclient.types.ModelType;

import java.util.List;

import javax.annotation.Nullable;

public class Award implements RenderableModel, TbaDatabaseModel {

    private Integer awardType = null;
    private String eventKey = null;
    private String key = null;
    private Long lastModified = null;
    private String name = null;
    private List<AwardRecipient> recipientList = null;
    private Integer year = null;

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    @Nullable @Override public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Nullable @Override public Long getLastModified() {
        return lastModified;
    }

    @Override public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Nullable public List<AwardRecipient> getRecipientList() {
        return recipientList;
    }

    public void setRecipientList(List<AwardRecipient> recipientList) {
        this.recipientList = recipientList;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Nullable
    public Integer getEnum() {
        return getAwardType();
    }

    public void setEnum(int awardType) {
        setAwardType(awardType);
    }

    @Override
    public ContentValues getParams(Gson gson) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(AwardsTable.KEY, getKey());
        contentValues.put(AwardsTable.ENUM, getEnum());
        contentValues.put(AwardsTable.EVENTKEY, getEventKey());
        contentValues.put(AwardsTable.NAME, getName());
        contentValues.put(AwardsTable.YEAR, getYear());
        contentValues.put(AwardsTable.WINNERS, gson.toJson(getRecipientList(), new TypeToken<List<AwardRecipient>>(){}.getType()));
        contentValues.put(AwardsTable.LAST_MODIFIED, getLastModified());
        return contentValues;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ListElement render(ModelRendererSupplier supplier) {
        ModelRenderer<Award, ?> renderer = supplier.getRendererForType(ModelType.AWARD);
        return renderer != null ? renderer.renderFromModel(this, null) : null;
    }

    public static class AwardRecipient {
        private @Nullable String awardee;
        private @Nullable String teamKey;
        private @Nullable Long lastModified;

        @Nullable public String getAwardee() {
            return awardee;
        }

        public void setAwardee(@Nullable String awardee) {
            this.awardee = awardee;
        }

        @Nullable public String getTeamKey() {
            return teamKey;
        }

        public void setTeamKey(@Nullable String teamKey) {
            this.teamKey = teamKey;
        }

        @Nullable public Long getLastModified() {
            return lastModified;
        }

        public void setLastModified(@Nullable Long lastModified) {
            this.lastModified = lastModified;
        }
    }
}
