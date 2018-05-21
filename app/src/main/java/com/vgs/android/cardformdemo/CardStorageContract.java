package com.vgs.android.cardformdemo;


import android.provider.BaseColumns;

// Define a contract class to define our names for DB URIs/tables/columns.
public final class CardStorageContract {

    private CardStorageContract() {
    }

    public static class CardEntry implements BaseColumns {
        public static final String TABLE_NAME = "CARDS";
        public static final String card_COLUMN_NAME_CARDID = "cardid";

        // 'tokenized' card details
        public static final String CARDS_COLUMN_NAME_CARDTYPE = "cardtype";
        public static final String CARDS_COLUMN_NAME_CARD_CCN = "ccn";
        public static final String CARDS_COLUMN_NAME_CARD_CVV = "cvv";
        public static final String CARDS_COLUMN_NAME_CARD_MONTH = "month";
        public static final String CARDS_COLUMN_NAME_CARD_YEAR = "year";

        // 'tokenized' personal details
        public static final String CARDS_COLUMN_NAME_CARD_POST_CODE = "post_code";
        public static final String CARDS_COLUMN_NAME_CARD_COUNTRYCODE = "countrycode";
        public static final String CARDS_COLUMN_NAME_CARD_MOBILE = "mobile";
    }
}
