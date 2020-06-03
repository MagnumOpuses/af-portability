package se.arbetsformedlingen.matchning.portability.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "LanguageCodeList")
@XmlEnum
public enum LanguageCodeList {


    /**
     * Afar
     */
    @XmlEnumValue("aa")
    @JsonProperty("aa")
    AA("aa"),

    /**
     * Abkhazian
     */
    @XmlEnumValue("ab")
    @JsonProperty("ab")
    AB("ab"),

    /**
     * Avestan
     */
    @XmlEnumValue("ae")
    @JsonProperty("ae")
    AE("ae"),

    /**
     * Afrikaans
     */
    @XmlEnumValue("af")
    @JsonProperty("af")
    AF("af"),

    /**
     * Afrikaans, South Africa
     */
    @XmlEnumValue("af-ZA")
    @JsonProperty("af-ZA")
    AF_ZA("af-ZA"),

    /**
     * Akan
     */
    @XmlEnumValue("ak")
    @JsonProperty("ak")
    AK("ak"),

    /**
     * Amharic
     */
    @XmlEnumValue("am")
    @JsonProperty("am")
    AM("am"),

    /**
     * Amharic, Ethiopia
     */
    @XmlEnumValue("am-ET")
    @JsonProperty("am-ET")
    AM_ET("am-ET"),

    /**
     * Aragonese
     */
    @XmlEnumValue("an")
    @JsonProperty("an")
    AN("an"),

    /**
     * Arabic
     */
    @XmlEnumValue("ar")
    @JsonProperty("ar")
    AR("ar"),

    /**
     * Arabic, U.A.E.
     */
    @XmlEnumValue("ar-AE")
    @JsonProperty("ar-AE")
    AR_AE("ar-AE"),

    /**
     * Arabic, Bahrain
     */
    @XmlEnumValue("ar-BH")
    @JsonProperty("ar-BH")
    AR_BH("ar-BH"),

    /**
     * Arabic, Algeria
     */
    @XmlEnumValue("ar-DZ")
    @JsonProperty("ar-DZ")
    AR_DZ("ar-DZ"),

    /**
     * Arabic, Egypt
     */
    @XmlEnumValue("ar-EG")
    @JsonProperty("ar-EG")
    AR_EG("ar-EG"),

    /**
     * Arabic, Iraq
     */
    @XmlEnumValue("ar-IQ")
    @JsonProperty("ar-IQ")
    AR_IQ("ar-IQ"),

    /**
     * Arabic, Jordan
     */
    @XmlEnumValue("ar-JO")
    @JsonProperty("ar-JO")
    AR_JO("ar-JO"),

    /**
     * Arabic, Kuwait
     */
    @XmlEnumValue("ar-KW")
    @JsonProperty("ar-KW")
    AR_KW("ar-KW"),

    /**
     * Arabic, Lebanon
     */
    @XmlEnumValue("ar-LB")
    @JsonProperty("ar-LB")
    AR_LB("ar-LB"),

    /**
     * Arabic, Libya
     */
    @XmlEnumValue("ar-LY")
    @JsonProperty("ar-LY")
    AR_LY("ar-LY"),

    /**
     * Arabic, Morocco
     */
    @XmlEnumValue("ar-MA")
    @JsonProperty("ar-MA")
    AR_MA("ar-MA"),

    /**
     * Arabic, Oman
     */
    @XmlEnumValue("ar-OM")
    @JsonProperty("ar-OM")
    AR_OM("ar-OM"),

    /**
     * Arabic, Qatar
     */
    @XmlEnumValue("ar-QA")
    @JsonProperty("ar-QA")
    AR_QA("ar-QA"),

    /**
     * Arabic, Saudi Arabia
     */
    @XmlEnumValue("ar-SA")
    @JsonProperty("ar-SA")
    AR_SA("ar-SA"),

    /**
     * Arabic, Syria
     */
    @XmlEnumValue("ar-SY")
    @JsonProperty("ar-SY")
    AR_SY("ar-SY"),

    /**
     * Arabic, Tunisia
     */
    @XmlEnumValue("ar-TN")
    @JsonProperty("ar-TN")
    AR_TN("ar-TN"),

    /**
     * Arabic, Yemen
     */
    @XmlEnumValue("ar-YE")
    @JsonProperty("ar-YE")
    AR_YE("ar-YE"),

    /**
     * Mapudungun
     */
    @XmlEnumValue("arn")
    @JsonProperty("arn")
    ARN("arn"),

    /**
     * Mapudungun, Chile
     */
    @XmlEnumValue("arn-CL")
    @JsonProperty("arn-CL")
    ARN_CL("arn-CL"),

    /**
     * Assamese
     */
    @XmlEnumValue("as")
    @JsonProperty("as")
    AS("as"),

    /**
     * Assamese, India
     */
    @XmlEnumValue("as-IN")
    @JsonProperty("as-IN")
    AS_IN("as-IN"),

    /**
     * Avaric
     */
    @XmlEnumValue("av")
    @JsonProperty("av")
    AV("av"),

    /**
     * Aymara
     */
    @XmlEnumValue("ay")
    @JsonProperty("ay")
    AY("ay"),

    /**
     * Azerbaijani (Latin)
     */
    @XmlEnumValue("az")
    @JsonProperty("az")
    AZ("az"),

    /**
     * Azerbaijani (Cyrillic)
     */
    @XmlEnumValue("az-Cyrl")
    @JsonProperty("az-Cyrl")
    AZ_CYRL("az-Cyrl"),

    /**
     * Azerbaijani (Cyrillic), Azerbaijan
     */
    @XmlEnumValue("az-Cyrl-AZ")
    @JsonProperty("az-Cyrl-AZ")
    AZ_CYRL_AZ("az-Cyrl-AZ"),

    /**
     * Azerbaijani (Latin)
     */
    @XmlEnumValue("az-Latn")
    @JsonProperty("az-Latn")
    AZ_LATN("az-Latn"),

    /**
     * Azerbaijani (Latin), Azerbaijan
     */
    @XmlEnumValue("az-Latn-AZ")
    @JsonProperty("az-Latn-AZ")
    AZ_LATN_AZ("az-Latn-AZ"),

    /**
     * Bashkir
     */
    @XmlEnumValue("ba")
    @JsonProperty("ba")
    BA("ba"),

    /**
     * Bashkir, Russia
     */
    @XmlEnumValue("ba-RU")
    @JsonProperty("ba-RU")
    BA_RU("ba-RU"),

    /**
     * Belarusian
     */
    @XmlEnumValue("be")
    @JsonProperty("be")
    BE("be"),

    /**
     * Belarusian, Belarus
     */
    @XmlEnumValue("be-BY")
    @JsonProperty("be-BY")
    BE_BY("be-BY"),

    /**
     * Bulgarian
     */
    @XmlEnumValue("bg")
    @JsonProperty("bg")
    BG("bg"),

    /**
     * Bulgarian, Bulgaria
     */
    @XmlEnumValue("bg-BG")
    @JsonProperty("bg-BG")
    BG_BG("bg-BG"),

    /**
     * Bihari languages
     */
    @XmlEnumValue("bh")
    @JsonProperty("bh")
    BH("bh"),

    /**
     * Bislama
     */
    @XmlEnumValue("bi")
    @JsonProperty("bi")
    BI("bi"),

    /**
     * Bambara
     */
    @XmlEnumValue("bm")
    @JsonProperty("bm")
    BM("bm"),

    /**
     * Bangla
     */
    @XmlEnumValue("bn")
    @JsonProperty("bn")
    BN("bn"),

    /**
     * Bangla, Bangladesh
     */
    @XmlEnumValue("bn-BD")
    @JsonProperty("bn-BD")
    BN_BD("bn-BD"),

    /**
     * Bangla, India
     */
    @XmlEnumValue("bn-IN")
    @JsonProperty("bn-IN")
    BN_IN("bn-IN"),

    /**
     * Tibetan
     */
    @XmlEnumValue("bo")
    @JsonProperty("bo")
    BO("bo"),

    /**
     * Tibetan, People's Republic of China
     */
    @XmlEnumValue("bo-CN")
    @JsonProperty("bo-CN")
    BO_CN("bo-CN"),

    /**
     * Breton
     */
    @XmlEnumValue("br")
    @JsonProperty("br")
    BR("br"),

    /**
     * Breton, France
     */
    @XmlEnumValue("br-FR")
    @JsonProperty("br-FR")
    BR_FR("br-FR"),

    /**
     * Bosnian (Latin)
     */
    @XmlEnumValue("bs")
    @JsonProperty("bs")
    BS("bs"),

    /**
     * Croatian
     */
    @XmlEnumValue("bs, hr, or sr")
    @JsonProperty("bs, hr, or sr")
    BS_HR_OR_SR("bs, hr, or sr"),

    /**
     * Bosnian (Cyrillic)
     */
    @XmlEnumValue("bs-Cyrl")
    @JsonProperty("bs-Cyrl")
    BS_CYRL("bs-Cyrl"),

    /**
     * Bosnian (Cyrillic), Bosnia and Herzegovina
     */
    @XmlEnumValue("bs-Cyrl-BA")
    @JsonProperty("bs-Cyrl-BA")
    BS_CYRL_BA("bs-Cyrl-BA"),

    /**
     * Bosnian (Latin)
     */
    @XmlEnumValue("bs-Latn")
    @JsonProperty("bs-Latn")
    BS_LATN("bs-Latn"),

    /**
     * Bosnian (Latin), Bosnia and Herzegovina
     */
    @XmlEnumValue("bs-Latn-BA")
    @JsonProperty("bs-Latn-BA")
    BS_LATN_BA("bs-Latn-BA"),

    /**
     * Catalan
     */
    @XmlEnumValue("ca")
    @JsonProperty("ca")
    CA("ca"),

    /**
     * Catalan, Spain
     */
    @XmlEnumValue("ca-ES")
    @JsonProperty("ca-ES")
    CA_ES("ca-ES"),

    /**
     * Valencian, Spain
     */
    @XmlEnumValue("ca-ES-valencia")
    @JsonProperty("ca-ES-valencia")
    CA_ES_VALENCIA("ca-ES-valencia"),

    /**
     * Chechen
     */
    @XmlEnumValue("ce")
    @JsonProperty("ce")
    CE("ce"),

    /**
     * Chamorro
     */
    @XmlEnumValue("ch")
    @JsonProperty("ch")
    CH("ch"),

    /**
     * Cherokee
     */
    @XmlEnumValue("chr")
    @JsonProperty("chr")
    CHR("chr"),

    /**
     * Cherokee
     */
    @XmlEnumValue("chr-Cher")
    @JsonProperty("chr-Cher")
    CHR_CHER("chr-Cher"),

    /**
     * Cherokee, United States
     */
    @XmlEnumValue("chr-Cher-US")
    @JsonProperty("chr-Cher-US")
    CHR_CHER_US("chr-Cher-US"),

    /**
     * Corsican
     */
    @XmlEnumValue("co")
    @JsonProperty("co")
    CO("co"),

    /**
     * Corsican, France
     */
    @XmlEnumValue("co-FR")
    @JsonProperty("co-FR")
    CO_FR("co-FR"),

    /**
     * Cree
     */
    @XmlEnumValue("cr")
    @JsonProperty("cr")
    CR("cr"),

    /**
     * Czech
     */
    @XmlEnumValue("cs")
    @JsonProperty("cs")
    CS("cs"),

    /**
     * Czech, Czech Republic
     */
    @XmlEnumValue("cs-CZ")
    @JsonProperty("cs-CZ")
    CS_CZ("cs-CZ"),

    /**
     * Church Slavic; Old Slavonic; Church Slavonic; Old Bulgarian; Old Church Slavonic
     */
    @XmlEnumValue("cu")
    @JsonProperty("cu")
    CU("cu"),

    /**
     * Chuvash
     */
    @XmlEnumValue("cv")
    @JsonProperty("cv")
    CV("cv"),

    /**
     * Welsh
     */
    @XmlEnumValue("cy")
    @JsonProperty("cy")
    CY("cy"),

    /**
     * Welsh, United Kingdom
     */
    @XmlEnumValue("cy-GB")
    @JsonProperty("cy-GB")
    CY_GB("cy-GB"),

    /**
     * Danish
     */
    @XmlEnumValue("da")
    @JsonProperty("da")
    DA("da"),

    /**
     * Danish, Denmark
     */
    @XmlEnumValue("da-DK")
    @JsonProperty("da-DK")
    DA_DK("da-DK"),

    /**
     * German
     */
    @XmlEnumValue("de")
    @JsonProperty("de")
    DE("de"),

    /**
     * German, Austria
     */
    @XmlEnumValue("de-AT")
    @JsonProperty("de-AT")
    DE_AT("de-AT"),

    /**
     * German, Switzerland
     */
    @XmlEnumValue("de-CH")
    @JsonProperty("de-CH")
    DE_CH("de-CH"),

    /**
     * German, Germany
     */
    @XmlEnumValue("de-DE")
    @JsonProperty("de-DE")
    DE_DE("de-DE"),

    /**
     * German, Liechtenstein
     */
    @XmlEnumValue("de-LI")
    @JsonProperty("de-LI")
    DE_LI("de-LI"),

    /**
     * German, Luxembourg
     */
    @XmlEnumValue("de-LU")
    @JsonProperty("de-LU")
    DE_LU("de-LU"),

    /**
     * Upper Sorbian
     */
    @XmlEnumValue("dsb or hsb")
    @JsonProperty("dsb or hsb")
    DSB_OR_HSB("dsb or hsb"),

    /**
     * Lower Sorbian
     */
    @XmlEnumValue("dsb")
    @JsonProperty("dsb")
    DSB("dsb"),

    /**
     * Lower Sorbian, Germany
     */
    @XmlEnumValue("dsb-DE")
    @JsonProperty("dsb-DE")
    DSB_DE("dsb-DE"),

    /**
     * Divehi
     */
    @XmlEnumValue("dv")
    @JsonProperty("dv")
    DV("dv"),

    /**
     * Divehi, Maldives
     */
    @XmlEnumValue("dv-MV")
    @JsonProperty("dv-MV")
    DV_MV("dv-MV"),

    /**
     * Dzongkha
     */
    @XmlEnumValue("dz")
    @JsonProperty("dz")
    DZ("dz"),

    /**
     * Ewe
     */
    @XmlEnumValue("ee")
    @JsonProperty("ee")
    EE("ee"),

    /**
     * Greek
     */
    @XmlEnumValue("el")
    @JsonProperty("el")
    EL("el"),

    /**
     * Greek, Greece
     */
    @XmlEnumValue("el-GR")
    @JsonProperty("el-GR")
    EL_GR("el-GR"),

    /**
     * English
     */
    @XmlEnumValue("en")
    @JsonProperty("en")
    EN("en"),

    /**
     * English, Caribbean
     */
    @XmlEnumValue("en-029")
    @JsonProperty("en-029")
    EN_029("en-029"),

    /**
     * English, Australia
     */
    @XmlEnumValue("en-AU")
    @JsonProperty("en-AU")
    EN_AU("en-AU"),

    /**
     * English, Belize
     */
    @XmlEnumValue("en-BZ")
    @JsonProperty("en-BZ")
    EN_BZ("en-BZ"),

    /**
     * English, Canada
     */
    @XmlEnumValue("en-CA")
    @JsonProperty("en-CA")
    EN_CA("en-CA"),

    /**
     * English, United Kingdom
     */
    @XmlEnumValue("en-GB")
    @JsonProperty("en-GB")
    EN_GB("en-GB"),

    /**
     * English, Hong Kong
     */
    @XmlEnumValue("en-HK")
    @JsonProperty("en-HK")
    EN_HK("en-HK"),

    /**
     * English, Ireland
     */
    @XmlEnumValue("en-IE")
    @JsonProperty("en-IE")
    EN_IE("en-IE"),

    /**
     * English, India
     */
    @XmlEnumValue("en-IN")
    @JsonProperty("en-IN")
    EN_IN("en-IN"),

    /**
     * English, Jamaica
     */
    @XmlEnumValue("en-JM")
    @JsonProperty("en-JM")
    EN_JM("en-JM"),

    /**
     * English, Malaysia
     */
    @XmlEnumValue("en-MY")
    @JsonProperty("en-MY")
    EN_MY("en-MY"),

    /**
     * English, New Zealand
     */
    @XmlEnumValue("en-NZ")
    @JsonProperty("en-NZ")
    EN_NZ("en-NZ"),

    /**
     * English, Republic of the Philippines
     */
    @XmlEnumValue("en-PH")
    @JsonProperty("en-PH")
    EN_PH("en-PH"),

    /**
     * English, Singapore
     */
    @XmlEnumValue("en-SG")
    @JsonProperty("en-SG")
    EN_SG("en-SG"),

    /**
     * English, Trinidad and Tobago
     */
    @XmlEnumValue("en-TT")
    @JsonProperty("en-TT")
    EN_TT("en-TT"),

    /**
     * English, United States
     */
    @XmlEnumValue("en-US")
    @JsonProperty("en-US")
    EN_US("en-US"),

    /**
     * English, South Africa
     */
    @XmlEnumValue("en-ZA")
    @JsonProperty("en-ZA")
    EN_ZA("en-ZA"),

    /**
     * English, Zimbabwe
     */
    @XmlEnumValue("en-ZW")
    @JsonProperty("en-ZW")
    EN_ZW("en-ZW"),

    /**
     * Esperanto
     */
    @XmlEnumValue("eo")
    @JsonProperty("eo")
    EO("eo"),

    /**
     * Spanish
     */
    @XmlEnumValue("es")
    @JsonProperty("es")
    ES("es"),

    /**
     * Spanish, Latin America
     */
    @XmlEnumValue("es-419")
    @JsonProperty("es-419")
    ES_419("es-419"),

    /**
     * Spanish, Argentina
     */
    @XmlEnumValue("es-AR")
    @JsonProperty("es-AR")
    ES_AR("es-AR"),

    /**
     * Spanish, Bolivia
     */
    @XmlEnumValue("es-BO")
    @JsonProperty("es-BO")
    ES_BO("es-BO"),

    /**
     * Spanish, Chile
     */
    @XmlEnumValue("es-CL")
    @JsonProperty("es-CL")
    ES_CL("es-CL"),

    /**
     * Spanish, Colombia
     */
    @XmlEnumValue("es-CO")
    @JsonProperty("es-CO")
    ES_CO("es-CO"),

    /**
     * Spanish, Costa Rica
     */
    @XmlEnumValue("es-CR")
    @JsonProperty("es-CR")
    ES_CR("es-CR"),

    /**
     * Spanish, Dominican Republic
     */
    @XmlEnumValue("es-DO")
    @JsonProperty("es-DO")
    ES_DO("es-DO"),

    /**
     * Spanish, Ecuador
     */
    @XmlEnumValue("es-EC")
    @JsonProperty("es-EC")
    ES_EC("es-EC"),

    /**
     * Spanish, Spain
     */
    @XmlEnumValue("es-ES")
    @JsonProperty("es-ES")
    ES_ES("es-ES"),

    /**
     * Spanish, Spain
     */
    @XmlEnumValue("es-ES_tradnl")
    @JsonProperty("es-ES_tradnl")
    ES_ES_TRADNL("es-ES_tradnl"),

    /**
     * Spanish, Guatemala
     */
    @XmlEnumValue("es-GT")
    @JsonProperty("es-GT")
    ES_GT("es-GT"),

    /**
     * Spanish, Honduras
     */
    @XmlEnumValue("es-HN")
    @JsonProperty("es-HN")
    ES_HN("es-HN"),

    /**
     * Spanish, Mexico
     */
    @XmlEnumValue("es-MX")
    @JsonProperty("es-MX")
    ES_MX("es-MX"),

    /**
     * Spanish, Nicaragua
     */
    @XmlEnumValue("es-NI")
    @JsonProperty("es-NI")
    ES_NI("es-NI"),

    /**
     * Spanish, Panama
     */
    @XmlEnumValue("es-PA")
    @JsonProperty("es-PA")
    ES_PA("es-PA"),

    /**
     * Spanish, Peru
     */
    @XmlEnumValue("es-PE")
    @JsonProperty("es-PE")
    ES_PE("es-PE"),

    /**
     * Spanish, Puerto Rico
     */
    @XmlEnumValue("es-PR")
    @JsonProperty("es-PR")
    ES_PR("es-PR"),

    /**
     * Spanish, Paraguay
     */
    @XmlEnumValue("es-PY")
    @JsonProperty("es-PY")
    ES_PY("es-PY"),

    /**
     * Spanish, El Salvador
     */
    @XmlEnumValue("es-SV")
    @JsonProperty("es-SV")
    ES_SV("es-SV"),

    /**
     * Spanish, United States
     */
    @XmlEnumValue("es-US")
    @JsonProperty("es-US")
    ES_US("es-US"),

    /**
     * Spanish, Uruguay
     */
    @XmlEnumValue("es-UY")
    @JsonProperty("es-UY")
    ES_UY("es-UY"),

    /**
     * Spanish, Bolivarian Republic of Venezuela
     */
    @XmlEnumValue("es-VE")
    @JsonProperty("es-VE")
    ES_VE("es-VE"),

    /**
     * Estonian
     */
    @XmlEnumValue("et")
    @JsonProperty("et")
    ET("et"),

    /**
     * Estonian, Estonia
     */
    @XmlEnumValue("et-EE")
    @JsonProperty("et-EE")
    ET_EE("et-EE"),

    /**
     * Basque
     */
    @XmlEnumValue("eu")
    @JsonProperty("eu")
    EU("eu"),

    /**
     * Basque, Spain
     */
    @XmlEnumValue("eu-ES")
    @JsonProperty("eu-ES")
    EU_ES("eu-ES"),

    /**
     * Persian
     */
    @XmlEnumValue("fa")
    @JsonProperty("fa")
    FA("fa"),

    /**
     * Persian, Iran
     */
    @XmlEnumValue("fa-IR")
    @JsonProperty("fa-IR")
    FA_IR("fa-IR"),

    /**
     * Fulah
     */
    @XmlEnumValue("ff")
    @JsonProperty("ff")
    FF("ff"),

    /**
     * Fulah
     */
    @XmlEnumValue("ff-Latn")
    @JsonProperty("ff-Latn")
    FF_LATN("ff-Latn"),

    /**
     * Fulah, Senegal
     */
    @XmlEnumValue("ff-Latn-SN")
    @JsonProperty("ff-Latn-SN")
    FF_LATN_SN("ff-Latn-SN"),

    /**
     * Finnish
     */
    @XmlEnumValue("fi")
    @JsonProperty("fi")
    FI("fi"),

    /**
     * Finnish, Finland
     */
    @XmlEnumValue("fi-FI")
    @JsonProperty("fi-FI")
    FI_FI("fi-FI"),

    /**
     * Filipino
     */
    @XmlEnumValue("fil")
    @JsonProperty("fil")
    FIL("fil"),

    /**
     * Filipino, Philippines
     */
    @XmlEnumValue("fil-PH")
    @JsonProperty("fil-PH")
    FIL_PH("fil-PH"),

    /**
     * Fijian
     */
    @XmlEnumValue("fj")
    @JsonProperty("fj")
    FJ("fj"),

    /**
     * Faroese
     */
    @XmlEnumValue("fo")
    @JsonProperty("fo")
    FO("fo"),

    /**
     * Faroese, Faroe Islands
     */
    @XmlEnumValue("fo-FO")
    @JsonProperty("fo-FO")
    FO_FO("fo-FO"),

    /**
     * French
     */
    @XmlEnumValue("fr")
    @JsonProperty("fr")
    FR("fr"),

    /**
     * French, Belgium
     */
    @XmlEnumValue("fr-BE")
    @JsonProperty("fr-BE")
    FR_BE("fr-BE"),

    /**
     * French, Canada
     */
    @XmlEnumValue("fr-CA")
    @JsonProperty("fr-CA")
    FR_CA("fr-CA"),

    /**
     * French, Congo, DRC
     */
    @XmlEnumValue("fr-CD")
    @JsonProperty("fr-CD")
    FR_CD("fr-CD"),

    /**
     * French, Switzerland
     */
    @XmlEnumValue("fr-CH")
    @JsonProperty("fr-CH")
    FR_CH("fr-CH"),

    /**
     * French, Côte d’Ivoire
     */
    @XmlEnumValue("fr-CI")
    @JsonProperty("fr-CI")
    FR_CI("fr-CI"),

    /**
     * French, Cameroon
     */
    @XmlEnumValue("fr-CM")
    @JsonProperty("fr-CM")
    FR_CM("fr-CM"),

    /**
     * French, France
     */
    @XmlEnumValue("fr-FR")
    @JsonProperty("fr-FR")
    FR_FR("fr-FR"),

    /**
     * French, Haiti
     */
    @XmlEnumValue("fr-HT")
    @JsonProperty("fr-HT")
    FR_HT("fr-HT"),

    /**
     * French, Luxembourg
     */
    @XmlEnumValue("fr-LU")
    @JsonProperty("fr-LU")
    FR_LU("fr-LU"),

    /**
     * French, Morocco
     */
    @XmlEnumValue("fr-MA")
    @JsonProperty("fr-MA")
    FR_MA("fr-MA"),

    /**
     * French, Principality of Monaco
     */
    @XmlEnumValue("fr-MC")
    @JsonProperty("fr-MC")
    FR_MC("fr-MC"),

    /**
     * French, Mali
     */
    @XmlEnumValue("fr-ML")
    @JsonProperty("fr-ML")
    FR_ML("fr-ML"),

    /**
     * French, Reunion
     */
    @XmlEnumValue("fr-RE")
    @JsonProperty("fr-RE")
    FR_RE("fr-RE"),

    /**
     * French, Senegal
     */
    @XmlEnumValue("fr-SN")
    @JsonProperty("fr-SN")
    FR_SN("fr-SN"),

    /**
     * Frisian
     */
    @XmlEnumValue("fy")
    @JsonProperty("fy")
    FY("fy"),

    /**
     * Frisian, Netherlands
     */
    @XmlEnumValue("fy-NL")
    @JsonProperty("fy-NL")
    FY_NL("fy-NL"),

    /**
     * Irish
     */
    @XmlEnumValue("ga")
    @JsonProperty("ga")
    GA("ga"),

    /**
     * Irish, Ireland
     */
    @XmlEnumValue("ga-IE")
    @JsonProperty("ga-IE")
    GA_IE("ga-IE"),

    /**
     * Scottish Gaelic
     */
    @XmlEnumValue("gd")
    @JsonProperty("gd")
    GD("gd"),

    /**
     * Scottish Gaelic, United Kingdom
     */
    @XmlEnumValue("gd-GB")
    @JsonProperty("gd-GB")
    GD_GB("gd-GB"),

    /**
     * Galician
     */
    @XmlEnumValue("gl")
    @JsonProperty("gl")
    GL("gl"),

    /**
     * Galician, Spain
     */
    @XmlEnumValue("gl-ES")
    @JsonProperty("gl-ES")
    GL_ES("gl-ES"),

    /**
     * Guarani
     */
    @XmlEnumValue("gn")
    @JsonProperty("gn")
    GN("gn"),

    /**
     * Guarani, Paraguay
     */
    @XmlEnumValue("gn-PY")
    @JsonProperty("gn-PY")
    GN_PY("gn-PY"),

    /**
     * Alsatian
     */
    @XmlEnumValue("gsw")
    @JsonProperty("gsw")
    GSW("gsw"),

    /**
     * Alsatian, France
     */
    @XmlEnumValue("gsw-FR")
    @JsonProperty("gsw-FR")
    GSW_FR("gsw-FR"),

    /**
     * Gujarati
     */
    @XmlEnumValue("gu")
    @JsonProperty("gu")
    GU("gu"),

    /**
     * Gujarati, India
     */
    @XmlEnumValue("gu-IN")
    @JsonProperty("gu-IN")
    GU_IN("gu-IN"),

    /**
     * Manx
     */
    @XmlEnumValue("gv")
    @JsonProperty("gv")
    GV("gv"),

    /**
     * Hausa (Latin)
     */
    @XmlEnumValue("ha")
    @JsonProperty("ha")
    HA("ha"),

    /**
     * Hausa (Latin)
     */
    @XmlEnumValue("ha-Latn")
    @JsonProperty("ha-Latn")
    HA_LATN("ha-Latn"),

    /**
     * Hausa (Latin), Nigeria
     */
    @XmlEnumValue("ha-Latn-NG")
    @JsonProperty("ha-Latn-NG")
    HA_LATN_NG("ha-Latn-NG"),

    /**
     * Hawaiian
     */
    @XmlEnumValue("haw")
    @JsonProperty("haw")
    HAW("haw"),

    /**
     * Hawaiian, United States
     */
    @XmlEnumValue("haw-US")
    @JsonProperty("haw-US")
    HAW_US("haw-US"),

    /**
     * Hebrew
     */
    @XmlEnumValue("he")
    @JsonProperty("he")
    HE("he"),

    /**
     * Hebrew, Israel
     */
    @XmlEnumValue("he-IL")
    @JsonProperty("he-IL")
    HE_IL("he-IL"),

    /**
     * Hindi
     */
    @XmlEnumValue("hi")
    @JsonProperty("hi")
    HI("hi"),

    /**
     * Hindi, India
     */
    @XmlEnumValue("hi-IN")
    @JsonProperty("hi-IN")
    HI_IN("hi-IN"),

    /**
     * Hiri Motu
     */
    @XmlEnumValue("ho")
    @JsonProperty("ho")
    HO("ho"),

    /**
     * Croatian
     */
    @XmlEnumValue("hr")
    @JsonProperty("hr")
    HR("hr"),

    /**
     * Croatian (Latin), Bosnia and Herzegovina
     */
    @XmlEnumValue("hr-BA")
    @JsonProperty("hr-BA")
    HR_BA("hr-BA"),

    /**
     * Croatian, Croatia
     */
    @XmlEnumValue("hr-HR")
    @JsonProperty("hr-HR")
    HR_HR("hr-HR"),

    /**
     * Upper Sorbian, Germany
     */
    @XmlEnumValue("hsb-DE")
    @JsonProperty("hsb-DE")
    HSB_DE("hsb-DE"),

    /**
     * Haitian; Haitian Creole
     */
    @XmlEnumValue("ht")
    @JsonProperty("ht")
    HT("ht"),

    /**
     * Hungarian
     */
    @XmlEnumValue("hu")
    @JsonProperty("hu")
    HU("hu"),

    /**
     * Hungarian, Hungary
     */
    @XmlEnumValue("hu-HU")
    @JsonProperty("hu-HU")
    HU_HU("hu-HU"),

    /**
     * Armenian
     */
    @XmlEnumValue("hy")
    @JsonProperty("hy")
    HY("hy"),

    /**
     * Armenian, Armenia
     */
    @XmlEnumValue("hy-AM")
    @JsonProperty("hy-AM")
    HY_AM("hy-AM"),

    /**
     * Herero
     */
    @XmlEnumValue("hz")
    @JsonProperty("hz")
    HZ("hz"),

    /**
     * Interlingua (International Auxiliary Language Association)
     */
    @XmlEnumValue("ia")
    @JsonProperty("ia")
    IA("ia"),

    /**
     * Indonesian
     */
    @XmlEnumValue("id")
    @JsonProperty("id")
    ID("id"),

    /**
     * Indonesian, Indonesia
     */
    @XmlEnumValue("id-ID")
    @JsonProperty("id-ID")
    ID_ID("id-ID"),

    /**
     * Interlingue; Occidental
     */
    @XmlEnumValue("ie")
    @JsonProperty("ie")
    IE("ie"),

    /**
     * Igbo
     */
    @XmlEnumValue("ig")
    @JsonProperty("ig")
    IG("ig"),

    /**
     * Igbo, Nigeria
     */
    @XmlEnumValue("ig-NG")
    @JsonProperty("ig-NG")
    IG_NG("ig-NG"),

    /**
     * Yi
     */
    @XmlEnumValue("ii")
    @JsonProperty("ii")
    II("ii"),

    /**
     * Yi, People's Republic of China
     */
    @XmlEnumValue("ii-CN")
    @JsonProperty("ii-CN")
    II_CN("ii-CN"),

    /**
     * Inupiaq
     */
    @XmlEnumValue("ik")
    @JsonProperty("ik")
    IK("ik"),

    /**
     * Ido
     */
    @XmlEnumValue("io")
    @JsonProperty("io")
    IO("io"),

    /**
     * Icelandic
     */
    @XmlEnumValue("is")
    @JsonProperty("is")
    IS("is"),

    /**
     * Icelandic, Iceland
     */
    @XmlEnumValue("is-IS")
    @JsonProperty("is-IS")
    IS_IS("is-IS"),

    /**
     * Italian
     */
    @XmlEnumValue("it")
    @JsonProperty("it")
    IT("it"),

    /**
     * Italian, Switzerland
     */
    @XmlEnumValue("it-CH")
    @JsonProperty("it-CH")
    IT_CH("it-CH"),

    /**
     * Italian, Italy
     */
    @XmlEnumValue("it-IT")
    @JsonProperty("it-IT")
    IT_IT("it-IT"),

    /**
     * Inuktitut (Latin)
     */
    @XmlEnumValue("iu")
    @JsonProperty("iu")
    IU("iu"),

    /**
     * Inuktitut (Syllabics)
     */
    @XmlEnumValue("iu-Cans")
    @JsonProperty("iu-Cans")
    IU_CANS("iu-Cans"),

    /**
     * Inuktitut (Syllabics), Canada
     */
    @XmlEnumValue("iu-Cans-CA")
    @JsonProperty("iu-Cans-CA")
    IU_CANS_CA("iu-Cans-CA"),

    /**
     * Inuktitut (Latin)
     */
    @XmlEnumValue("iu-Latn")
    @JsonProperty("iu-Latn")
    IU_LATN("iu-Latn"),

    /**
     * Inuktitut (Latin), Canada
     */
    @XmlEnumValue("iu-Latn-CA")
    @JsonProperty("iu-Latn-CA")
    IU_LATN_CA("iu-Latn-CA"),

    /**
     * Japanese
     */
    @XmlEnumValue("ja")
    @JsonProperty("ja")
    JA("ja"),

    /**
     * Japanese, Japan
     */
    @XmlEnumValue("ja-JP")
    @JsonProperty("ja-JP")
    JA_JP("ja-JP"),

    /**
     * Javanese
     */
    @XmlEnumValue("jv")
    @JsonProperty("jv")
    JV("jv"),

    /**
     * Javanese, Latin
     */
    @XmlEnumValue("jv-Latn")
    @JsonProperty("jv-Latn")
    JV_LATN("jv-Latn"),

    /**
     * Javanese, Latin, Indonesia
     */
    @XmlEnumValue("jv-Latn-ID")
    @JsonProperty("jv-Latn-ID")
    JV_LATN_ID("jv-Latn-ID"),

    /**
     * Georgian
     */
    @XmlEnumValue("ka")
    @JsonProperty("ka")
    KA("ka"),

    /**
     * Georgian, Georgia
     */
    @XmlEnumValue("ka-GE")
    @JsonProperty("ka-GE")
    KA_GE("ka-GE"),

    /**
     * Kongo
     */
    @XmlEnumValue("kg")
    @JsonProperty("kg")
    KG("kg"),

    /**
     * Kikuyu; Gikuyu
     */
    @XmlEnumValue("ki")
    @JsonProperty("ki")
    KI("ki"),

    /**
     * Kuanyama; Kwanyama
     */
    @XmlEnumValue("kj")
    @JsonProperty("kj")
    KJ("kj"),

    /**
     * Kazakh
     */
    @XmlEnumValue("kk")
    @JsonProperty("kk")
    KK("kk"),

    /**
     * Kazakh, Kazakhstan
     */
    @XmlEnumValue("kk-KZ")
    @JsonProperty("kk-KZ")
    KK_KZ("kk-KZ"),

    /**
     * Greenlandic
     */
    @XmlEnumValue("kl")
    @JsonProperty("kl")
    KL("kl"),

    /**
     * Greenlandic, Greenland
     */
    @XmlEnumValue("kl-GL")
    @JsonProperty("kl-GL")
    KL_GL("kl-GL"),

    /**
     * Khmer
     */
    @XmlEnumValue("km")
    @JsonProperty("km")
    KM("km"),

    /**
     * Khmer, Cambodia
     */
    @XmlEnumValue("km-KH")
    @JsonProperty("km-KH")
    KM_KH("km-KH"),

    /**
     * Kannada
     */
    @XmlEnumValue("kn")
    @JsonProperty("kn")
    KN("kn"),

    /**
     * Kannada, India
     */
    @XmlEnumValue("kn-IN")
    @JsonProperty("kn-IN")
    KN_IN("kn-IN"),

    /**
     * Korean
     */
    @XmlEnumValue("ko")
    @JsonProperty("ko")
    KO("ko"),

    /**
     * Konkani
     */
    @XmlEnumValue("kok")
    @JsonProperty("kok")
    KOK("kok"),

    /**
     * Konkani, India
     */
    @XmlEnumValue("kok-IN")
    @JsonProperty("kok-IN")
    KOK_IN("kok-IN"),

    /**
     * Korean, Korea
     */
    @XmlEnumValue("ko-KR")
    @JsonProperty("ko-KR")
    KO_KR("ko-KR"),

    /**
     * Kanuri
     */
    @XmlEnumValue("kr")
    @JsonProperty("kr")
    KR("kr"),

    /**
     * Kashmiri
     */
    @XmlEnumValue("ks")
    @JsonProperty("ks")
    KS("ks"),

    /**
     * Central Kurdish
     */
    @XmlEnumValue("ku")
    @JsonProperty("ku")
    KU("ku"),

    /**
     * Central Kurdish
     */
    @XmlEnumValue("ku-Arab")
    @JsonProperty("ku-Arab")
    KU_ARAB("ku-Arab"),

    /**
     * Central Kurdish, Iraq
     */
    @XmlEnumValue("ku-Arab-IQ")
    @JsonProperty("ku-Arab-IQ")
    KU_ARAB_IQ("ku-Arab-IQ"),

    /**
     * Komi
     */
    @XmlEnumValue("kv")
    @JsonProperty("kv")
    KV("kv"),

    /**
     * Cornish
     */
    @XmlEnumValue("kw")
    @JsonProperty("kw")
    KW("kw"),

    /**
     * Kyrgyz
     */
    @XmlEnumValue("ky")
    @JsonProperty("ky")
    KY("ky"),

    /**
     * Kyrgyz, Kyrgyzstan
     */
    @XmlEnumValue("ky-KG")
    @JsonProperty("ky-KG")
    KY_KG("ky-KG"),

    /**
     * Latin
     */
    @XmlEnumValue("la")
    @JsonProperty("la")
    LA("la"),

    /**
     * Luxembourgish
     */
    @XmlEnumValue("lb")
    @JsonProperty("lb")
    LB("lb"),

    /**
     * Luxembourgish, Luxembourg
     */
    @XmlEnumValue("lb-LU")
    @JsonProperty("lb-LU")
    LB_LU("lb-LU"),

    /**
     * Ganda
     */
    @XmlEnumValue("lg")
    @JsonProperty("lg")
    LG("lg"),

    /**
     * Limburgan; Limburger; Limburgish
     */
    @XmlEnumValue("li")
    @JsonProperty("li")
    LI("li"),

    /**
     * Lingala
     */
    @XmlEnumValue("ln")
    @JsonProperty("ln")
    LN("ln"),

    /**
     * Lao
     */
    @XmlEnumValue("lo")
    @JsonProperty("lo")
    LO("lo"),

    /**
     * Lao, Lao P.D.R.
     */
    @XmlEnumValue("lo-LA")
    @JsonProperty("lo-LA")
    LO_LA("lo-LA"),

    /**
     * Lithuanian
     */
    @XmlEnumValue("lt")
    @JsonProperty("lt")
    LT("lt"),

    /**
     * Lithuanian, Lithuania
     */
    @XmlEnumValue("lt-LT")
    @JsonProperty("lt-LT")
    LT_LT("lt-LT"),

    /**
     * Luba-Katanga
     */
    @XmlEnumValue("lu")
    @JsonProperty("lu")
    LU("lu"),

    /**
     * Latvian
     */
    @XmlEnumValue("lv")
    @JsonProperty("lv")
    LV("lv"),

    /**
     * Latvian, Latvia
     */
    @XmlEnumValue("lv-LV")
    @JsonProperty("lv-LV")
    LV_LV("lv-LV"),

    /**
     * Malagasy
     */
    @XmlEnumValue("mg")
    @JsonProperty("mg")
    MG("mg"),

    /**
     * Malagasy, Madagascar
     */
    @XmlEnumValue("mg-MG")
    @JsonProperty("mg-MG")
    MG_MG("mg-MG"),

    /**
     * Marshallese
     */
    @XmlEnumValue("mh")
    @JsonProperty("mh")
    MH("mh"),

    /**
     * Maori
     */
    @XmlEnumValue("mi")
    @JsonProperty("mi")
    MI("mi"),

    /**
     * Maori, New Zealand
     */
    @XmlEnumValue("mi-NZ")
    @JsonProperty("mi-NZ")
    MI_NZ("mi-NZ"),

    /**
     * Macedonian
     */
    @XmlEnumValue("mk")
    @JsonProperty("mk")
    MK("mk"),

    /**
     * Macedonian, Macedonia (Former Yugoslav Republic of Macedonia)
     */
    @XmlEnumValue("mk-MK")
    @JsonProperty("mk-MK")
    MK_MK("mk-MK"),

    /**
     * Malayalam
     */
    @XmlEnumValue("ml")
    @JsonProperty("ml")
    ML("ml"),

    /**
     * Malayalam, India
     */
    @XmlEnumValue("ml-IN")
    @JsonProperty("ml-IN")
    ML_IN("ml-IN"),

    /**
     * Mongolian (Cyrillic)
     */
    @XmlEnumValue("mn")
    @JsonProperty("mn")
    MN("mn"),

    /**
     * Mongolian (Cyrillic)
     */
    @XmlEnumValue("mn-Cyrl")
    @JsonProperty("mn-Cyrl")
    MN_CYRL("mn-Cyrl"),

    /**
     * Mongolian (Cyrillic), Mongolia
     */
    @XmlEnumValue("mn-MN")
    @JsonProperty("mn-MN")
    MN_MN("mn-MN"),

    /**
     * Mongolian (Traditional Mongolian)
     */
    @XmlEnumValue("mn-Mong")
    @JsonProperty("mn-Mong")
    MN_MONG("mn-Mong"),

    /**
     * Mongolian (Traditional Mongolian), People's Republic of China
     */
    @XmlEnumValue("mn-Mong-CN")
    @JsonProperty("mn-Mong-CN")
    MN_MONG_CN("mn-Mong-CN"),

    /**
     * Moldavian; Moldovan
     */
    @XmlEnumValue("mo")
    @JsonProperty("mo")
    MO("mo"),

    /**
     * Mohawk
     */
    @XmlEnumValue("moh")
    @JsonProperty("moh")
    MOH("moh"),

    /**
     * Mohawk, Canada
     */
    @XmlEnumValue("moh-CA")
    @JsonProperty("moh-CA")
    MOH_CA("moh-CA"),

    /**
     * Marathi
     */
    @XmlEnumValue("mr")
    @JsonProperty("mr")
    MR("mr"),

    /**
     * Marathi, India
     */
    @XmlEnumValue("mr-IN")
    @JsonProperty("mr-IN")
    MR_IN("mr-IN"),

    /**
     * Malay
     */
    @XmlEnumValue("ms")
    @JsonProperty("ms")
    MS("ms"),

    /**
     * Malay, Brunei Darussalam
     */
    @XmlEnumValue("ms-BN")
    @JsonProperty("ms-BN")
    MS_BN("ms-BN"),

    /**
     * Malay, Malaysia
     */
    @XmlEnumValue("ms-MY")
    @JsonProperty("ms-MY")
    MS_MY("ms-MY"),

    /**
     * Maltese
     */
    @XmlEnumValue("mt")
    @JsonProperty("mt")
    MT("mt"),

    /**
     * Maltese, Malta
     */
    @XmlEnumValue("mt-MT")
    @JsonProperty("mt-MT")
    MT_MT("mt-MT"),

    /**
     * Burmese
     */
    @XmlEnumValue("my")
    @JsonProperty("my")
    MY("my"),

    /**
     * Burmese, Myanmar
     */
    @XmlEnumValue("my-MM")
    @JsonProperty("my-MM")
    MY_MM("my-MM"),

    /**
     * Nauru
     */
    @XmlEnumValue("na")
    @JsonProperty("na")
    NA("na"),

    /**
     * Norwegian (Bokmal)
     */
    @XmlEnumValue("nb")
    @JsonProperty("nb")
    NB("nb"),

    /**
     * Norwegian (Bokmal), Norway
     */
    @XmlEnumValue("nb-NO")
    @JsonProperty("nb-NO")
    NB_NO("nb-NO"),

    /**
     * Ndebele; North; North Ndebele
     */
    @XmlEnumValue("nd")
    @JsonProperty("nd")
    ND("nd"),

    /**
     * Nepali
     */
    @XmlEnumValue("ne")
    @JsonProperty("ne")
    NE("ne"),

    /**
     * Nepali, India
     */
    @XmlEnumValue("ne-IN")
    @JsonProperty("ne-IN")
    NE_IN("ne-IN"),

    /**
     * Nepali, Nepal
     */
    @XmlEnumValue("ne-NP")
    @JsonProperty("ne-NP")
    NE_NP("ne-NP"),

    /**
     * Ndonga
     */
    @XmlEnumValue("ng")
    @JsonProperty("ng")
    NG("ng"),

    /**
     * Dutch
     */
    @XmlEnumValue("nl")
    @JsonProperty("nl")
    NL("nl"),

    /**
     * Dutch, Belgium
     */
    @XmlEnumValue("nl-BE")
    @JsonProperty("nl-BE")
    NL_BE("nl-BE"),

    /**
     * Dutch, Netherlands
     */
    @XmlEnumValue("nl-NL")
    @JsonProperty("nl-NL")
    NL_NL("nl-NL"),

    /**
     * Norwegian (Nynorsk)
     */
    @XmlEnumValue("nn")
    @JsonProperty("nn")
    NN("nn"),

    /**
     * Norwegian (Nynorsk), Norway
     */
    @XmlEnumValue("nn-NO")
    @JsonProperty("nn-NO")
    NN_NO("nn-NO"),

    /**
     * Norwegian (Bokmal)
     */
    @XmlEnumValue("no")
    @JsonProperty("no")
    NO("no"),

    /**
     * N’ko
     */
    @XmlEnumValue("nqo")
    @JsonProperty("nqo")
    NQO("nqo"),

    /**
     * N’ko, Guinea
     */
    @XmlEnumValue("nqo-GN")
    @JsonProperty("nqo-GN")
    NQO_GN("nqo-GN"),

    /**
     * Ndebele; South; South Ndebele
     */
    @XmlEnumValue("nr")
    @JsonProperty("nr")
    NR("nr"),

    /**
     * Sesotho sa Leboa
     */
    @XmlEnumValue("nso")
    @JsonProperty("nso")
    NSO("nso"),

    /**
     * Sesotho sa Leboa, South Africa
     */
    @XmlEnumValue("nso-ZA")
    @JsonProperty("nso-ZA")
    NSO_ZA("nso-ZA"),

    /**
     * Navajo; Navaho
     */
    @XmlEnumValue("nv")
    @JsonProperty("nv")
    NV("nv"),

    /**
     * Chichewa; Chewa; Nyanja
     */
    @XmlEnumValue("ny")
    @JsonProperty("ny")
    NY("ny"),

    /**
     * Occitan
     */
    @XmlEnumValue("oc")
    @JsonProperty("oc")
    OC("oc"),

    /**
     * Occitan, France
     */
    @XmlEnumValue("oc-FR")
    @JsonProperty("oc-FR")
    OC_FR("oc-FR"),

    /**
     * Ojibwa
     */
    @XmlEnumValue("oj")
    @JsonProperty("oj")
    OJ("oj"),

    /**
     * Oromo
     */
    @XmlEnumValue("om")
    @JsonProperty("om")
    OM("om"),

    /**
     * Oromo, Ethiopia
     */
    @XmlEnumValue("om-ET")
    @JsonProperty("om-ET")
    OM_ET("om-ET"),

    /**
     * Odia
     */
    @XmlEnumValue("or")
    @JsonProperty("or")
    OR("or"),

    /**
     * Odia, India
     */
    @XmlEnumValue("or-IN")
    @JsonProperty("or-IN")
    OR_IN("or-IN"),

    /**
     * Ossetian; Ossetic
     */
    @XmlEnumValue("os")
    @JsonProperty("os")
    OS("os"),

    /**
     * Punjabi
     */
    @XmlEnumValue("pa")
    @JsonProperty("pa")
    PA("pa"),

    /**
     * Punjabi
     */
    @XmlEnumValue("pa-Arab")
    @JsonProperty("pa-Arab")
    PA_ARAB("pa-Arab"),

    /**
     * Punjabi, Islamic Republic of Pakistan
     */
    @XmlEnumValue("pa-Arab-PK")
    @JsonProperty("pa-Arab-PK")
    PA_ARAB_PK("pa-Arab-PK"),

    /**
     * Punjabi, India
     */
    @XmlEnumValue("pa-IN")
    @JsonProperty("pa-IN")
    PA_IN("pa-IN"),

    /**
     * Pali
     */
    @XmlEnumValue("pi")
    @JsonProperty("pi")
    PI("pi"),

    /**
     * Polish
     */
    @XmlEnumValue("pl")
    @JsonProperty("pl")
    PL("pl"),

    /**
     * Polish, Poland
     */
    @XmlEnumValue("pl-PL")
    @JsonProperty("pl-PL")
    PL_PL("pl-PL"),

    /**
     * Dari
     */
    @XmlEnumValue("prs")
    @JsonProperty("prs")
    PRS("prs"),

    /**
     * Dari, Afghanistan
     */
    @XmlEnumValue("prs-AF")
    @JsonProperty("prs-AF")
    PRS_AF("prs-AF"),

    /**
     * Pashto
     */
    @XmlEnumValue("ps")
    @JsonProperty("ps")
    PS("ps"),

    /**
     * Pashto, Afghanistan
     */
    @XmlEnumValue("ps-AF")
    @JsonProperty("ps-AF")
    PS_AF("ps-AF"),

    /**
     * Portuguese
     */
    @XmlEnumValue("pt")
    @JsonProperty("pt")
    PT("pt"),

    /**
     * Portuguese, Angola
     */
    @XmlEnumValue("pt-AO")
    @JsonProperty("pt-AO")
    PT_AO("pt-AO"),

    /**
     * Portuguese, Brazil
     */
    @XmlEnumValue("pt-BR")
    @JsonProperty("pt-BR")
    PT_BR("pt-BR"),

    /**
     * Portuguese, Portugal
     */
    @XmlEnumValue("pt-PT")
    @JsonProperty("pt-PT")
    PT_PT("pt-PT"),

    /**
     * Quechua
     */
    @XmlEnumValue("qu")
    @JsonProperty("qu")
    QU("qu"),

    /**
     * K'iche
     */
    @XmlEnumValue("qut")
    @JsonProperty("qut")
    QUT("qut"),

    /**
     * K'iche, Guatemala
     */
    @XmlEnumValue("qut-GT")
    @JsonProperty("qut-GT")
    QUT_GT("qut-GT"),

    /**
     * Quechua
     */
    @XmlEnumValue("quz")
    @JsonProperty("quz")
    QUZ("quz"),

    /**
     * Quechua, Bolivia
     */
    @XmlEnumValue("quz-BO")
    @JsonProperty("quz-BO")
    QUZ_BO("quz-BO"),

    /**
     * Quechua, Ecuador
     */
    @XmlEnumValue("quz-EC")
    @JsonProperty("quz-EC")
    QUZ_EC("quz-EC"),

    /**
     * Quechua, Peru
     */
    @XmlEnumValue("quz-PE")
    @JsonProperty("quz-PE")
    QUZ_PE("quz-PE"),

    /**
     * Romansh
     */
    @XmlEnumValue("rm")
    @JsonProperty("rm")
    RM("rm"),

    /**
     * Romansh, Switzerland
     */
    @XmlEnumValue("rm-CH")
    @JsonProperty("rm-CH")
    RM_CH("rm-CH"),

    /**
     * Rundi
     */
    @XmlEnumValue("rn")
    @JsonProperty("rn")
    RN("rn"),

    /**
     * Romanian
     */
    @XmlEnumValue("ro")
    @JsonProperty("ro")
    RO("ro"),

    /**
     * Romanian, Moldova
     */
    @XmlEnumValue("ro-MD")
    @JsonProperty("ro-MD")
    RO_MD("ro-MD"),

    /**
     * Romanian, Romania
     */
    @XmlEnumValue("ro-RO")
    @JsonProperty("ro-RO")
    RO_RO("ro-RO"),

    /**
     * Russian
     */
    @XmlEnumValue("ru")
    @JsonProperty("ru")
    RU("ru"),

    /**
     * Russian, Russia
     */
    @XmlEnumValue("ru-RU")
    @JsonProperty("ru-RU")
    RU_RU("ru-RU"),

    /**
     * Kinyarwanda
     */
    @XmlEnumValue("rw")
    @JsonProperty("rw")
    RW("rw"),

    /**
     * Kinyarwanda, Rwanda
     */
    @XmlEnumValue("rw-RW")
    @JsonProperty("rw-RW")
    RW_RW("rw-RW"),

    /**
     * Sanskrit
     */
    @XmlEnumValue("sa")
    @JsonProperty("sa")
    SA("sa"),

    /**
     * Sakha
     */
    @XmlEnumValue("sah")
    @JsonProperty("sah")
    SAH("sah"),

    /**
     * Sakha, Russia
     */
    @XmlEnumValue("sah-RU")
    @JsonProperty("sah-RU")
    SAH_RU("sah-RU"),

    /**
     * Sanskrit, India
     */
    @XmlEnumValue("sa-IN")
    @JsonProperty("sa-IN")
    SA_IN("sa-IN"),

    /**
     * Sardinian
     */
    @XmlEnumValue("sc")
    @JsonProperty("sc")
    SC("sc"),

    /**
     * Sindhi
     */
    @XmlEnumValue("sd")
    @JsonProperty("sd")
    SD("sd"),

    /**
     * Sindhi
     */
    @XmlEnumValue("sd-Arab")
    @JsonProperty("sd-Arab")
    SD_ARAB("sd-Arab"),

    /**
     * Sindhi, Islamic Republic of Pakistan
     */
    @XmlEnumValue("sd-Arab-PK")
    @JsonProperty("sd-Arab-PK")
    SD_ARAB_PK("sd-Arab-PK"),

    /**
     * Sami (Northern)
     */
    @XmlEnumValue("se")
    @JsonProperty("se")
    SE("se"),

    /**
     * Sami (Northern), Finland
     */
    @XmlEnumValue("se-FI")
    @JsonProperty("se-FI")
    SE_FI("se-FI"),

    /**
     * Sami (Northern), Norway
     */
    @XmlEnumValue("se-NO")
    @JsonProperty("se-NO")
    SE_NO("se-NO"),

    /**
     * Sami (Northern), Sweden
     */
    @XmlEnumValue("se-SE")
    @JsonProperty("se-SE")
    SE_SE("se-SE"),

    /**
     * Sango
     */
    @XmlEnumValue("sg")
    @JsonProperty("sg")
    SG("sg"),

    /**
     * Sinhala
     */
    @XmlEnumValue("si")
    @JsonProperty("si")
    SI("si"),

    /**
     * Sinhala, Sri Lanka
     */
    @XmlEnumValue("si-LK")
    @JsonProperty("si-LK")
    SI_LK("si-LK"),

    /**
     * Slovak
     */
    @XmlEnumValue("sk")
    @JsonProperty("sk")
    SK("sk"),

    /**
     * Slovak, Slovakia
     */
    @XmlEnumValue("sk-SK")
    @JsonProperty("sk-SK")
    SK_SK("sk-SK"),

    /**
     * Slovenian
     */
    @XmlEnumValue("sl")
    @JsonProperty("sl")
    SL("sl"),

    /**
     * Slovenian, Slovenia
     */
    @XmlEnumValue("sl-SI")
    @JsonProperty("sl-SI")
    SL_SI("sl-SI"),

    /**
     * Samoan
     */
    @XmlEnumValue("sm")
    @JsonProperty("sm")
    SM("sm"),

    /**
     * Sami (Southern)
     */
    @XmlEnumValue("sma")
    @JsonProperty("sma")
    SMA("sma"),

    /**
     * Sami (Southern), Norway
     */
    @XmlEnumValue("sma-NO")
    @JsonProperty("sma-NO")
    SMA_NO("sma-NO"),

    /**
     * Sami (Southern), Sweden
     */
    @XmlEnumValue("sma-SE")
    @JsonProperty("sma-SE")
    SMA_SE("sma-SE"),

    /**
     * Sami (Lule)
     */
    @XmlEnumValue("smj")
    @JsonProperty("smj")
    SMJ("smj"),

    /**
     * Sami (Lule), Norway
     */
    @XmlEnumValue("smj-NO")
    @JsonProperty("smj-NO")
    SMJ_NO("smj-NO"),

    /**
     * Sami (Lule), Sweden
     */
    @XmlEnumValue("smj-SE")
    @JsonProperty("smj-SE")
    SMJ_SE("smj-SE"),

    /**
     * Sami (Inari)
     */
    @XmlEnumValue("smn")
    @JsonProperty("smn")
    SMN("smn"),

    /**
     * Sami (Inari), Finland
     */
    @XmlEnumValue("smn-FI")
    @JsonProperty("smn-FI")
    SMN_FI("smn-FI"),

    /**
     * Sami (Skolt)
     */
    @XmlEnumValue("sms")
    @JsonProperty("sms")
    SMS("sms"),

    /**
     * Sami (Skolt), Finland
     */
    @XmlEnumValue("sms-FI")
    @JsonProperty("sms-FI")
    SMS_FI("sms-FI"),

    /**
     * Shona
     */
    @XmlEnumValue("sn")
    @JsonProperty("sn")
    SN("sn"),

    /**
     * Shona, Latin
     */
    @XmlEnumValue("sn-Latn")
    @JsonProperty("sn-Latn")
    SN_LATN("sn-Latn"),

    /**
     * Shona, Zimbabwe
     */
    @XmlEnumValue("sn-Latn-ZW")
    @JsonProperty("sn-Latn-ZW")
    SN_LATN_ZW("sn-Latn-ZW"),

    /**
     * Somali
     */
    @XmlEnumValue("so")
    @JsonProperty("so")
    SO("so"),

    /**
     * Somali, Somalia
     */
    @XmlEnumValue("so-SO")
    @JsonProperty("so-SO")
    SO_SO("so-SO"),

    /**
     * Albanian
     */
    @XmlEnumValue("sq")
    @JsonProperty("sq")
    SQ("sq"),

    /**
     * Albanian, Albania
     */
    @XmlEnumValue("sq-AL")
    @JsonProperty("sq-AL")
    SQ_AL("sq-AL"),

    /**
     * Serbian (Latin)
     */
    @XmlEnumValue("sr")
    @JsonProperty("sr")
    SR("sr"),

    /**
     * Serbian (Cyrillic)
     */
    @XmlEnumValue("sr-Cyrl")
    @JsonProperty("sr-Cyrl")
    SR_CYRL("sr-Cyrl"),

    /**
     * Serbian (Cyrillic), Bosnia and Herzegovina
     */
    @XmlEnumValue("sr-Cyrl-BA")
    @JsonProperty("sr-Cyrl-BA")
    SR_CYRL_BA("sr-Cyrl-BA"),

    /**
     * Serbian (Cyrillic), Serbia and Montenegro (Former)
     */
    @XmlEnumValue("sr-Cyrl-CS")
    @JsonProperty("sr-Cyrl-CS")
    SR_CYRL_CS("sr-Cyrl-CS"),

    /**
     * Serbian (Cyrillic), Montenegro
     */
    @XmlEnumValue("sr-Cyrl-ME")
    @JsonProperty("sr-Cyrl-ME")
    SR_CYRL_ME("sr-Cyrl-ME"),

    /**
     * Serbian (Cyrillic), Serbia
     */
    @XmlEnumValue("sr-Cyrl-RS")
    @JsonProperty("sr-Cyrl-RS")
    SR_CYRL_RS("sr-Cyrl-RS"),

    /**
     * Serbian (Latin)
     */
    @XmlEnumValue("sr-Latn")
    @JsonProperty("sr-Latn")
    SR_LATN("sr-Latn"),

    /**
     * Serbian (Latin), Bosnia and Herzegovina
     */
    @XmlEnumValue("sr-Latn-BA")
    @JsonProperty("sr-Latn-BA")
    SR_LATN_BA("sr-Latn-BA"),

    /**
     * Serbian (Latin), Serbia and Montenegro (Former)
     */
    @XmlEnumValue("sr-Latn-CS")
    @JsonProperty("sr-Latn-CS")
    SR_LATN_CS("sr-Latn-CS"),

    /**
     * Serbian (Latin), Montenegro
     */
    @XmlEnumValue("sr-Latn-ME")
    @JsonProperty("sr-Latn-ME")
    SR_LATN_ME("sr-Latn-ME"),

    /**
     * Serbian (Latin), Serbia
     */
    @XmlEnumValue("sr-Latn-RS")
    @JsonProperty("sr-Latn-RS")
    SR_LATN_RS("sr-Latn-RS"),

    /**
     * Swati
     */
    @XmlEnumValue("ss")
    @JsonProperty("ss")
    SS("ss"),

    /**
     * Sotho
     */
    @XmlEnumValue("st")
    @JsonProperty("st")
    ST("st"),

    /**
     * Sotho, South Africa
     */
    @XmlEnumValue("st-ZA")
    @JsonProperty("st-ZA")
    ST_ZA("st-ZA"),

    /**
     * Sundanese
     */
    @XmlEnumValue("su")
    @JsonProperty("su")
    SU("su"),

    /**
     * Swedish
     */
    @XmlEnumValue("sv")
    @JsonProperty("sv")
    SV("sv"),

    /**
     * Swedish, Finland
     */
    @XmlEnumValue("sv-FI")
    @JsonProperty("sv-FI")
    SV_FI("sv-FI"),

    /**
     * Swedish, Sweden
     */
    @XmlEnumValue("sv-SE")
    @JsonProperty("sv-SE")
    SV_SE("sv-SE"),

    /**
     * Kiswahili
     */
    @XmlEnumValue("sw")
    @JsonProperty("sw")
    SW("sw"),

    /**
     * Kiswahili, Kenya
     */
    @XmlEnumValue("sw-KE")
    @JsonProperty("sw-KE")
    SW_KE("sw-KE"),

    /**
     * Syriac
     */
    @XmlEnumValue("syr")
    @JsonProperty("syr")
    SYR("syr"),

    /**
     * Syriac, Syria
     */
    @XmlEnumValue("syr-SY")
    @JsonProperty("syr-SY")
    SYR_SY("syr-SY"),

    /**
     * Tamil
     */
    @XmlEnumValue("ta")
    @JsonProperty("ta")
    TA("ta"),

    /**
     * Tamil, India
     */
    @XmlEnumValue("ta-IN")
    @JsonProperty("ta-IN")
    TA_IN("ta-IN"),

    /**
     * Tamil, Sri Lanka
     */
    @XmlEnumValue("ta-LK")
    @JsonProperty("ta-LK")
    TA_LK("ta-LK"),

    /**
     * Telugu
     */
    @XmlEnumValue("te")
    @JsonProperty("te")
    TE("te"),

    /**
     * Telugu, India
     */
    @XmlEnumValue("te-IN")
    @JsonProperty("te-IN")
    TE_IN("te-IN"),

    /**
     * Tajik (Cyrillic)
     */
    @XmlEnumValue("tg")
    @JsonProperty("tg")
    TG("tg"),

    /**
     * Tajik (Cyrillic)
     */
    @XmlEnumValue("tg-Cyrl")
    @JsonProperty("tg-Cyrl")
    TG_CYRL("tg-Cyrl"),

    /**
     * Tajik (Cyrillic), Tajikistan
     */
    @XmlEnumValue("tg-Cyrl-TJ")
    @JsonProperty("tg-Cyrl-TJ")
    TG_CYRL_TJ("tg-Cyrl-TJ"),

    /**
     * Thai
     */
    @XmlEnumValue("th")
    @JsonProperty("th")
    TH("th"),

    /**
     * Thai, Thailand
     */
    @XmlEnumValue("th-TH")
    @JsonProperty("th-TH")
    TH_TH("th-TH"),

    /**
     * Tigrinya
     */
    @XmlEnumValue("ti")
    @JsonProperty("ti")
    TI("ti"),

    /**
     * Tigrinya, Eritrea
     */
    @XmlEnumValue("ti-ER")
    @JsonProperty("ti-ER")
    TI_ER("ti-ER"),

    /**
     * Tigrinya, Ethiopia
     */
    @XmlEnumValue("ti-ET")
    @JsonProperty("ti-ET")
    TI_ET("ti-ET"),

    /**
     * Turkmen
     */
    @XmlEnumValue("tk")
    @JsonProperty("tk")
    TK("tk"),

    /**
     * Turkmen, Turkmenistan
     */
    @XmlEnumValue("tk-TM")
    @JsonProperty("tk-TM")
    TK_TM("tk-TM"),

    /**
     * Tagalog
     */
    @XmlEnumValue("tl")
    @JsonProperty("tl")
    TL("tl"),

    /**
     * Setswana
     */
    @XmlEnumValue("tn")
    @JsonProperty("tn")
    TN("tn"),

    /**
     * Setswana, Botswana
     */
    @XmlEnumValue("tn-BW")
    @JsonProperty("tn-BW")
    TN_BW("tn-BW"),

    /**
     * Setswana, South Africa
     */
    @XmlEnumValue("tn-ZA")
    @JsonProperty("tn-ZA")
    TN_ZA("tn-ZA"),

    /**
     * Tonga (Tonga Islands)
     */
    @XmlEnumValue("to")
    @JsonProperty("to")
    TO("to"),

    /**
     * Turkish
     */
    @XmlEnumValue("tr")
    @JsonProperty("tr")
    TR("tr"),

    /**
     * Turkish, Turkey
     */
    @XmlEnumValue("tr-TR")
    @JsonProperty("tr-TR")
    TR_TR("tr-TR"),

    /**
     * Tsonga
     */
    @XmlEnumValue("ts")
    @JsonProperty("ts")
    TS("ts"),

    /**
     * Tsonga, South Africa
     */
    @XmlEnumValue("ts-ZA")
    @JsonProperty("ts-ZA")
    TS_ZA("ts-ZA"),

    /**
     * Tatar
     */
    @XmlEnumValue("tt")
    @JsonProperty("tt")
    TT("tt"),

    /**
     * Tatar, Russia
     */
    @XmlEnumValue("tt-RU")
    @JsonProperty("tt-RU")
    TT_RU("tt-RU"),

    /**
     * Twi
     */
    @XmlEnumValue("tw")
    @JsonProperty("tw")
    TW("tw"),

    /**
     * Tahitian
     */
    @XmlEnumValue("ty")
    @JsonProperty("ty")
    TY("ty"),

    /**
     * Tamazight (Latin)
     */
    @XmlEnumValue("tzm")
    @JsonProperty("tzm")
    TZM("tzm"),

    /**
     * Tamazight (Latin)
     */
    @XmlEnumValue("tzm-Latn")
    @JsonProperty("tzm-Latn")
    TZM_LATN("tzm-Latn"),

    /**
     * Tamazight (Latin), Algeria
     */
    @XmlEnumValue("tzm-Latn-DZ")
    @JsonProperty("tzm-Latn-DZ")
    TZM_LATN_DZ("tzm-Latn-DZ"),

    /**
     * Uyghur
     */
    @XmlEnumValue("ug")
    @JsonProperty("ug")
    UG("ug"),

    /**
     * Uyghur, People's Republic of China
     */
    @XmlEnumValue("ug-CN")
    @JsonProperty("ug-CN")
    UG_CN("ug-CN"),

    /**
     * Ukrainian
     */
    @XmlEnumValue("uk")
    @JsonProperty("uk")
    UK("uk"),

    /**
     * Ukrainian, Ukraine
     */
    @XmlEnumValue("uk-UA")
    @JsonProperty("uk-UA")
    UK_UA("uk-UA"),

    /**
     * Urdu
     */
    @XmlEnumValue("ur")
    @JsonProperty("ur")
    UR("ur"),

    /**
     * Urdu, India
     */
    @XmlEnumValue("ur-IN")
    @JsonProperty("ur-IN")
    UR_IN("ur-IN"),

    /**
     * Urdu, Islamic Republic of Pakistan
     */
    @XmlEnumValue("ur-PK")
    @JsonProperty("ur-PK")
    UR_PK("ur-PK"),

    /**
     * Uzbek (Latin)
     */
    @XmlEnumValue("uz")
    @JsonProperty("uz")
    UZ("uz"),

    /**
     * Uzbek (Cyrillic)
     */
    @XmlEnumValue("uz-Cyrl")
    @JsonProperty("uz-Cyrl")
    UZ_CYRL("uz-Cyrl"),

    /**
     * Uzbek (Cyrillic), Uzbekistan
     */
    @XmlEnumValue("uz-Cyrl-UZ")
    @JsonProperty("uz-Cyrl-UZ")
    UZ_CYRL_UZ("uz-Cyrl-UZ"),

    /**
     * Uzbek (Latin)
     */
    @XmlEnumValue("uz-Latn")
    @JsonProperty("uz-Latn")
    UZ_LATN("uz-Latn"),

    /**
     * Uzbek (Latin), Uzbekistan
     */
    @XmlEnumValue("uz-Latn-UZ")
    @JsonProperty("uz-Latn-UZ")
    UZ_LATN_UZ("uz-Latn-UZ"),

    /**
     * Venda
     */
    @XmlEnumValue("ve")
    @JsonProperty("ve")
    VE("ve"),

    /**
     * Vietnamese
     */
    @XmlEnumValue("vi")
    @JsonProperty("vi")
    VI("vi"),

    /**
     * Vietnamese, Vietnam
     */
    @XmlEnumValue("vi-VN")
    @JsonProperty("vi-VN")
    VI_VN("vi-VN"),

    /**
     * Volapük
     */
    @XmlEnumValue("vo")
    @JsonProperty("vo")
    VO("vo"),

    /**
     * Walloon
     */
    @XmlEnumValue("wa")
    @JsonProperty("wa")
    WA("wa"),

    /**
     * Wolof
     */
    @XmlEnumValue("wo")
    @JsonProperty("wo")
    WO("wo"),

    /**
     * Wolof, Senegal
     */
    @XmlEnumValue("wo-SN")
    @JsonProperty("wo-SN")
    WO_SN("wo-SN"),

    /**
     * isiXhosa
     */
    @XmlEnumValue("xh")
    @JsonProperty("xh")
    XH("xh"),

    /**
     * isiXhosa, South Africa
     */
    @XmlEnumValue("xh-ZA")
    @JsonProperty("xh-ZA")
    XH_ZA("xh-ZA"),

    /**
     * Yiddish
     */
    @XmlEnumValue("yi")
    @JsonProperty("yi")
    YI("yi"),

    /**
     * Yoruba
     */
    @XmlEnumValue("yo")
    @JsonProperty("yo")
    YO("yo"),

    /**
     * Yoruba, Nigeria
     */
    @XmlEnumValue("yo-NG")
    @JsonProperty("yo-NG")
    YO_NG("yo-NG"),

    /**
     * Zhuang; Chuang
     */
    @XmlEnumValue("za")
    @JsonProperty("za")
    ZA("za"),

    /**
     * Standard Moroccan Tamazight
     */
    @XmlEnumValue("zgh")
    @JsonProperty("zgh")
    ZGH("zgh"),

    /**
     * Standard Moroccan Tamazight, Tifinagh
     */
    @XmlEnumValue("zgh-Tfng")
    @JsonProperty("zgh-Tfng")
    ZGH_TFNG("zgh-Tfng"),

    /**
     * Standard Moroccan Tamazight, Morocco
     */
    @XmlEnumValue("zgh-Tfng-MA")
    @JsonProperty("zgh-Tfng-MA")
    ZGH_TFNG_MA("zgh-Tfng-MA"),

    /**
     * Chinese (Simplified)
     */
    @XmlEnumValue("zh")
    @JsonProperty("zh")
    ZH("zh"),

    /**
     * Chinese (Simplified), People's Republic of China
     */
    @XmlEnumValue("zh-CN")
    @JsonProperty("zh-CN")
    ZH_CN("zh-CN"),

    /**
     * Chinese (Simplified)
     */
    @XmlEnumValue("zh-Hans")
    @JsonProperty("zh-Hans")
    ZH_HANS("zh-Hans"),

    /**
     * Chinese (Traditional)
     */
    @XmlEnumValue("zh-Hant")
    @JsonProperty("zh-Hant")
    ZH_HANT("zh-Hant"),

    /**
     * Chinese (Traditional), Hong Kong S.A.R.
     */
    @XmlEnumValue("zh-HK")
    @JsonProperty("zh-HK")
    ZH_HK("zh-HK"),

    /**
     * Chinese (Traditional), Macao S.A.R.
     */
    @XmlEnumValue("zh-MO")
    @JsonProperty("zh-MO")
    ZH_MO("zh-MO"),

    /**
     * Chinese (Simplified), Singapore
     */
    @XmlEnumValue("zh-SG")
    @JsonProperty("zh-SG")
    ZH_SG("zh-SG"),

    /**
     * Chinese (Traditional), Taiwan
     */
    @XmlEnumValue("zh-TW")
    @JsonProperty("zh-TW")
    ZH_TW("zh-TW"),

    /**
     * isiZulu
     */
    @XmlEnumValue("zu")
    @JsonProperty("zu")
    ZU("zu"),

    /**
     * isiZulu, South Africa
     */
    @XmlEnumValue("zu-ZA")
    @JsonProperty("zu-ZA")
    ZU_ZA("zu-ZA");
    private final String value;

    LanguageCodeList(final String v) {
        value = v;
    }

    public static LanguageCodeList fromValue(final String v) {
        for (final LanguageCodeList c : LanguageCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
