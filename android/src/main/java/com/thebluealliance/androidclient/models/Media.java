package com.thebluealliance.androidclient.models;

import android.content.ContentValues;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.thebluealliance.androidclient.database.TbaDatabaseModel;
import com.thebluealliance.androidclient.database.tables.MediasTable;
import com.thebluealliance.androidclient.helpers.JSONHelper;
import com.thebluealliance.androidclient.interfaces.RenderableModel;
import com.thebluealliance.androidclient.listitems.ListElement;
import com.thebluealliance.androidclient.renderers.MediaRenderer;
import com.thebluealliance.androidclient.renderers.ModelRendererSupplier;
import com.thebluealliance.androidclient.types.ModelType;

import javax.annotation.Nullable;


public class Media implements TbaDatabaseModel, RenderableModel<Media> {

    private String detailsJson = null;
    private String foreignKey = null;
    private Long lastModified = null;
    private String type = null;
    private Boolean preferred;
    private String base64Image = null;

    private JsonObject details;
    private String teamKey;
    private int year;

    public Media() {
    }

    @Override
    public String getKey() {
        return getForeignKey();
    }

    public JsonObject getDetailsJson() {
        if (details == null) {
            details = JSONHelper.getasJsonObject(getDetails());
        }
        return details;
    }

    public void setDetails(String detailsJson) {
        this.detailsJson = detailsJson;
    }

    @Nullable public String getDetails() {
        return detailsJson;
    }

    public String getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(String foreignKey) {
        this.foreignKey = foreignKey;
    }

    @Nullable @Override public Long getLastModified() {
        return lastModified;
    }

    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getPreferred() {
        return preferred;
    }

    public void setPreferred(Boolean preferred) {
        this.preferred = preferred;
    }

    @Nullable
    public String getBase64Image() {
        return base64Image;
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }

    public String getTeamKey() {
        return teamKey;
    }

    public void setTeamKey(String teamKey) {
        this.teamKey = teamKey;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public ContentValues getParams(Gson gson) {
        ContentValues data = new ContentValues();
        data.put(MediasTable.TYPE, getType());
        data.put(MediasTable.FOREIGNKEY, getForeignKey());
        data.put(MediasTable.TEAMKEY, getTeamKey());
        data.put(MediasTable.DETAILS, getDetails());
        data.put(MediasTable.B64_IMAGE, getBase64Image());
        data.put(MediasTable.YEAR, getYear());
        data.put(MediasTable.LAST_MODIFIED, getLastModified());
        return data;
    }

    @Override
    public ListElement render(ModelRendererSupplier rendererSupplier) {
        MediaRenderer renderer = (MediaRenderer) rendererSupplier.getRendererForType(ModelType.MEDIA);
        if (renderer == null) {
            return null;
        }
        return renderer.renderFromModel(this, null);
    }
}
