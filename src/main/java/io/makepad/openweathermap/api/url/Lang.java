package io.makepad.openweathermap.api.url;

public enum Lang {
    AFRIKAANS,
    ALBANIAN,
    ARABIC,
    AZERBAIJANI,
    BULGARIAN,
    CATALAN,
    CZECH,
    DANISH,
    GERMAN,
    GREEK,
    ENGLISH,
    BASQUE,
    PERSIAN,
    FINNISH,
    FRENCH,
    GALICIAN,
    HEBREW,
    HINDI,
    CROATIAN,
    HUNGARIAN,
    INDONESIAN,
    ITALIAN,
    JAPANESE,
    KOREAN,
    LATVIAN,
    LITHUANIAN,
    MACEDONIAN,
    NORWEGIAN,
    DUTCH,
    POLISH,
    PORTUGUESE,
    PORTUGUES_BRASIL,
    ROMANIAN,
    RUSSIAN,
    SWEDISH,
    SLOVAK,
    SLOVENIAN,
    SPANISH,
    SERBIAN,
    THAI,
    TURKISH,
    UKRAINIAN,
    VIETNAMESE,
    CHINESE_SIMPLIFIED,
    CHINESE_TRADITIONAL,
    ZULU;

    @Override
    public String toString() {
        return switch (this) {
            case AFRIKAANS -> "af";
            case ALBANIAN -> "al";
            case ARABIC -> "ar";
            case AZERBAIJANI -> "az";
            case BULGARIAN -> "bg";
            case CATALAN -> "ca";
            case CZECH -> "cz";
            case DANISH -> "da";
            case GERMAN -> "de";
            case GREEK -> "el";
            case ENGLISH -> "en";
            case BASQUE -> "eu";
            case PERSIAN -> "fa";
            case FINNISH -> "fi";
            case FRENCH -> "fr";
            case GALICIAN -> "gl";
            case HEBREW -> "he";
            case HINDI -> "hi";
            case CROATIAN -> "hr";
            case HUNGARIAN -> "hu";
            case INDONESIAN -> "id";
            case ITALIAN -> "it";
            case JAPANESE -> "ja";
            case KOREAN -> "kr";
            case LATVIAN -> "la";
            case LITHUANIAN -> "lt";
            case MACEDONIAN -> "mk";
            case NORWEGIAN -> "no";
            case DUTCH -> "nl";
            case POLISH -> "pl";
            case PORTUGUESE -> "pt";
            case PORTUGUES_BRASIL -> "pt_br";
            case ROMANIAN -> "ro";
            case RUSSIAN -> "ru";
            case SWEDISH -> "se";
            case SLOVAK -> "sk";
            case SLOVENIAN -> "sl";
            case SPANISH -> "es";
            case SERBIAN -> "sr";
            case THAI -> "th";
            case TURKISH -> "tr";
            case UKRAINIAN -> "uk";
            case VIETNAMESE -> "vi";
            case CHINESE_SIMPLIFIED -> "zh_cn";
            case CHINESE_TRADITIONAL -> "zh_tw";
            case ZULU -> "zu";
        };
    }
}
