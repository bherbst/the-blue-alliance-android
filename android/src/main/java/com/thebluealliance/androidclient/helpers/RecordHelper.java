package com.thebluealliance.androidclient.helpers;

import javax.annotation.Nullable;

import thebluealliance.api.model.WLTRecord;

public class RecordHelper {
   public static String formatWinLossTie(WLTRecord record) {
      if (record.getWins() == null
        || record.getLosses() == null
        || record.getTies() == null) {
         return "";
      }
      return String.valueOf(record.getWins())
        + "-"
        + record.getLosses()
        + "-"
        + record.getTies();
   }

   public static boolean isEmpty(@Nullable WLTRecord record) {
      if (record == null
        || record.getWins() == null
        || record.getLosses() == null
        || record.getTies() == null) {
         return true;
      }

      return record.getWins() == 0
        && record.getLosses() == 0
        && record.getTies() == 0;
   }
}
