
package se.arbetsformedlingen.matchning.portability.model.hropen;

import se.arbetsformedlingen.matchning.portability.model.hropen.common.base.*;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.codelist.*;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.communication.*;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.competency.CompetencyDimensionType;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.competency.CompetencyEvidenceType;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.competency.PersonCompetencyType;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.competency.SpecifiedCompetencyType;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.evaluation.BaseScoreType;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.evaluation.ScoreNumericType;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.evaluation.ScoreTextType;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.evaluation.ScoreType;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.organization.OrganizationReferenceType;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.organization.OrganizationType;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.pay.RemunerationPackageType;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.pay.RemunerationRangeType;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.person.*;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.process.*;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.profile.*;
import se.arbetsformedlingen.matchning.portability.model.hropen.common.work.*;
import se.arbetsformedlingen.matchning.portability.model.hropen.recruiting.*;
import se.arbetsformedlingen.matchning.portability.model.hropen.recruiting.codelist.CandidateRelationshipCodeList;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.arbetsformedlingen.matchning.portability.model.hropen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CurrencyCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "CurrencyCode");
    private final static QName _CareerLevelCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "CareerLevelCode");
    private final static QName _ScoreNumeric_QNAME = new QName("https://hropenstandards.org/schema/xml/", "ScoreNumeric");
    private final static QName _StringArray_QNAME = new QName("https://hropenstandards.org/schema/xml/", "StringArray");
    private final static QName _WeekdayCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "WeekdayCode");
    private final static QName _Measure_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Measure");
    private final static QName _EducationAttendance_QNAME = new QName("https://hropenstandards.org/schema/xml/", "EducationAttendance");
    private final static QName _Noun_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Noun");
    private final static QName _Entity_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Entity");
    private final static QName _AddressArray_QNAME = new QName("https://hropenstandards.org/schema/xml/", "AddressArray");
    private final static QName _AttachmentReference_QNAME = new QName("https://hropenstandards.org/schema/xml/", "AttachmentReference");
    private final static QName _RemunerationBasisCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "RemunerationBasisCode");
    private final static QName _AddressComponent_QNAME = new QName("https://hropenstandards.org/schema/xml/", "AddressComponent");
    private final static QName _Address_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Address");
    private final static QName _License_QNAME = new QName("https://hropenstandards.org/schema/xml/", "License");
    private final static QName _DateTime_QNAME = new QName("https://hropenstandards.org/schema/xml/", "DateTime");
    private final static QName _ProcessHistory_QNAME = new QName("https://hropenstandards.org/schema/xml/", "ProcessHistory");
    private final static QName _Geo_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Geo");
    private final static QName _PersonProfileInclusion_QNAME = new QName("https://hropenstandards.org/schema/xml/", "PersonProfileInclusion");
    private final static QName _Web_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Web");
    private final static QName _MilitaryService_QNAME = new QName("https://hropenstandards.org/schema/xml/", "MilitaryService");
    private final static QName _LegalDocument_QNAME = new QName("https://hropenstandards.org/schema/xml/", "LegalDocument");
    private final static QName _ProcessHistoryItem_QNAME = new QName("https://hropenstandards.org/schema/xml/", "ProcessHistoryItem");
    private final static QName _YearOpenEndPeriod_QNAME = new QName("https://hropenstandards.org/schema/xml/", "YearOpenEndPeriod");
    private final static QName _Publication_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Publication");
    private final static QName _AffiliatedOrganizationTypeCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "AffiliatedOrganizationTypeCode");
    private final static QName _Code_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Code");
    private final static QName _DateTimePeriod_QNAME = new QName("https://hropenstandards.org/schema/xml/", "DateTimePeriod");
    private final static QName _FormattedDateTime_QNAME = new QName("https://hropenstandards.org/schema/xml/", "FormattedDateTime");
    private final static QName _CandidateRelationshipCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "CandidateRelationshipCode");
    private final static QName _BinaryObject_QNAME = new QName("https://hropenstandards.org/schema/xml/", "BinaryObject");
    private final static QName _Communication_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Communication");
    private final static QName _BaseScore_QNAME = new QName("https://hropenstandards.org/schema/xml/", "BaseScore");
    private final static QName _Organization_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Organization");
    private final static QName _PersonLegalInclusion_QNAME = new QName("https://hropenstandards.org/schema/xml/", "PersonLegalInclusion");
    private final static QName _PersonCompetency_QNAME = new QName("https://hropenstandards.org/schema/xml/", "PersonCompetency");
    private final static QName _EmployerHistory_QNAME = new QName("https://hropenstandards.org/schema/xml/", "EmployerHistory");
    private final static QName _RemoteWork_QNAME = new QName("https://hropenstandards.org/schema/xml/", "RemoteWork");
    private final static QName _RelationshipTypeCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "RelationshipTypeCode");
    private final static QName _EffectiveTimePeriod_QNAME = new QName("https://hropenstandards.org/schema/xml/", "EffectiveTimePeriod");
    private final static QName _Year_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Year");
    private final static QName _Event_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Event");
    private final static QName _ResourceRelationshipCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "ResourceRelationshipCode");
    private final static QName _Amount_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Amount");
    private final static QName _PersonReference_QNAME = new QName("https://hropenstandards.org/schema/xml/", "PersonReference");
    private final static QName _IscedCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "IscedCode");
    private final static QName _Text_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Text");
    private final static QName _LocalizationInclusion_QNAME = new QName("https://hropenstandards.org/schema/xml/", "LocalizationInclusion");
    private final static QName _OpenEndPeriod_QNAME = new QName("https://hropenstandards.org/schema/xml/", "OpenEndPeriod");
    private final static QName _Identifier_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Identifier");
    private final static QName _LanguageCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "LanguageCode");
    private final static QName _PositionTypeCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "PositionTypeCode");
    private final static QName _EducationDegreeGrantedStatusCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "EducationDegreeGrantedStatusCode");
    private final static QName _Patent_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Patent");
    private final static QName _Email_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Email");
    private final static QName _PublicationTypeCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "PublicationTypeCode");
    private final static QName _CompetencyDimension_QNAME = new QName("https://hropenstandards.org/schema/xml/", "CompetencyDimension");
    private final static QName _EmploymentPermit_QNAME = new QName("https://hropenstandards.org/schema/xml/", "EmploymentPermit");
    private final static QName _Attachment_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Attachment");
    private final static QName _DateOpenEndPeriod_QNAME = new QName("https://hropenstandards.org/schema/xml/", "DateOpenEndPeriod");
    private final static QName _Score_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Score");
    private final static QName _PersonPhysicalInclusion_QNAME = new QName("https://hropenstandards.org/schema/xml/", "PersonPhysicalInclusion");
    private final static QName _BaseHistory_QNAME = new QName("https://hropenstandards.org/schema/xml/", "BaseHistory");
    private final static QName _DatePeriod_QNAME = new QName("https://hropenstandards.org/schema/xml/", "DatePeriod");
    private final static QName _DataProtectionPolicyInclusion_QNAME = new QName("https://hropenstandards.org/schema/xml/", "DataProtectionPolicyInclusion");
    private final static QName _GenderCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "GenderCode");
    private final static QName _Candidate_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Candidate");
    private final static QName _Duration_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Duration");
    private final static QName _Period_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Period");
    private final static QName _YearMonthPeriod_QNAME = new QName("https://hropenstandards.org/schema/xml/", "YearMonthPeriod");
    private final static QName _Certification_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Certification");
    private final static QName _RemunerationRange_QNAME = new QName("https://hropenstandards.org/schema/xml/", "RemunerationRange");
    private final static QName _UnitCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "UnitCode");
    private final static QName _Disability_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Disability");
    private final static QName _Phone_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Phone");
    private final static QName _YearPeriod_QNAME = new QName("https://hropenstandards.org/schema/xml/", "YearPeriod");
    private final static QName _PatentStatusCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "PatentStatusCode");
    private final static QName _Number_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Number");
    private final static QName _PersonBase_QNAME = new QName("https://hropenstandards.org/schema/xml/", "PersonBase");
    private final static QName _DateTimeOpenEndPeriod_QNAME = new QName("https://hropenstandards.org/schema/xml/", "DateTimeOpenEndPeriod");
    private final static QName _PhoneArray_QNAME = new QName("https://hropenstandards.org/schema/xml/", "PhoneArray");
    private final static QName _WorkLifeCycle_QNAME = new QName("https://hropenstandards.org/schema/xml/", "WorkLifeCycle");
    private final static QName _Relocation_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Relocation");
    private final static QName _CountryCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "CountryCode");
    private final static QName _SpecifiedPerson_QNAME = new QName("https://hropenstandards.org/schema/xml/", "SpecifiedPerson");
    private final static QName _RemunerationPackage_QNAME = new QName("https://hropenstandards.org/schema/xml/", "RemunerationPackage");
    private final static QName _Time_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Time");
    private final static QName _OrganizationAffiliation_QNAME = new QName("https://hropenstandards.org/schema/xml/", "OrganizationAffiliation");
    private final static QName _PayTypeCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "PayTypeCode");
    private final static QName _Travel_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Travel");
    private final static QName _YearMonthOpenEndPeriod_QNAME = new QName("https://hropenstandards.org/schema/xml/", "YearMonthOpenEndPeriod");
    private final static QName _PayRateIntervalCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "PayRateIntervalCode");
    private final static QName _Schedule_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Schedule");
    private final static QName _ScoreNumericCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "ScoreNumericCode");
    private final static QName _YearMonth_QNAME = new QName("https://hropenstandards.org/schema/xml/", "YearMonth");
    private final static QName _PositionScheduleTypeCode_QNAME = new QName("https://hropenstandards.org/schema/xml/", "PositionScheduleTypeCode");
    private final static QName _Location_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Location");
    private final static QName _EmailArray_QNAME = new QName("https://hropenstandards.org/schema/xml/", "EmailArray");
    private final static QName _OrganizationReference_QNAME = new QName("https://hropenstandards.org/schema/xml/", "OrganizationReference");
    private final static QName _CompetencyEvidence_QNAME = new QName("https://hropenstandards.org/schema/xml/", "CompetencyEvidence");
    private final static QName _PersonName_QNAME = new QName("https://hropenstandards.org/schema/xml/", "PersonName");
    private final static QName _SpecifiedCompetency_QNAME = new QName("https://hropenstandards.org/schema/xml/", "SpecifiedCompetency");
    private final static QName _Comment_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Comment");
    private final static QName _CommunicationItemInclusion_QNAME = new QName("https://hropenstandards.org/schema/xml/", "CommunicationItemInclusion");
    private final static QName _Percent_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Percent");
    private final static QName _WebArray_QNAME = new QName("https://hropenstandards.org/schema/xml/", "WebArray");
    private final static QName _Referee_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Referee");
    private final static QName _ScoreText_QNAME = new QName("https://hropenstandards.org/schema/xml/", "ScoreText");
    private final static QName _Indicator_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Indicator");
    private final static QName _Date_QNAME = new QName("https://hropenstandards.org/schema/xml/", "Date");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.arbetsformedlingen.matchning.portability.model.hropen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CandidatePersonType }
     * 
     */
    public CandidatePersonType createCandidatePersonType() {
        return new CandidatePersonType();
    }

    /**
     * Create an instance of {@link PositionPreferenceType }
     * 
     */
    public PositionPreferenceType createPositionPreferenceType() {
        return new PositionPreferenceType();
    }

    /**
     * Create an instance of {@link CandidateProfileType }
     * 
     */
    public CandidateProfileType createCandidateProfileType() {
        return new CandidateProfileType();
    }

    /**
     * Create an instance of {@link ContractType }
     * 
     */
    public ContractType createContractType() {
        return new ContractType();
    }

    /**
     * Create an instance of {@link DisabilitySummaryType }
     * 
     */
    public DisabilitySummaryType createDisabilitySummaryType() {
        return new DisabilitySummaryType();
    }

    /**
     * Create an instance of {@link EducationDegreeType }
     * 
     */
    public EducationDegreeType createEducationDegreeType() {
        return new EducationDegreeType();
    }

    /**
     * Create an instance of {@link DistributionGuidelinesType }
     * 
     */
    public DistributionGuidelinesType createDistributionGuidelinesType() {
        return new DistributionGuidelinesType();
    }

    /**
     * Create an instance of {@link PositionHistoryType }
     * 
     */
    public PositionHistoryType createPositionHistoryType() {
        return new PositionHistoryType();
    }

    /**
     * Create an instance of {@link HireType }
     * 
     */
    public HireType createHireType() {
        return new HireType();
    }

    /**
     * Create an instance of {@link RecruitingAndStaffingType }
     * 
     */
    public RecruitingAndStaffingType createRecruitingAndStaffingType() {
        return new RecruitingAndStaffingType();
    }

    /**
     * Create an instance of {@link PersonAvailabilityType }
     * 
     */
    public PersonAvailabilityType createPersonAvailabilityType() {
        return new PersonAvailabilityType();
    }

    /**
     * Create an instance of {@link EmployerPreferenceType }
     * 
     */
    public EmployerPreferenceType createEmployerPreferenceType() {
        return new EmployerPreferenceType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link EmailTypeArray }
     * 
     */
    public EmailTypeArray createEmailTypeArray() {
        return new EmailTypeArray();
    }

    /**
     * Create an instance of {@link ScheduleType }
     * 
     */
    public ScheduleType createScheduleType() {
        return new ScheduleType();
    }

    /**
     * Create an instance of {@link RefereeType }
     * 
     */
    public RefereeType createRefereeType() {
        return new RefereeType();
    }

    /**
     * Create an instance of {@link WebTypeArray }
     * 
     */
    public WebTypeArray createWebTypeArray() {
        return new WebTypeArray();
    }

    /**
     * Create an instance of {@link CompetencyEvidenceType }
     * 
     */
    public CompetencyEvidenceType createCompetencyEvidenceType() {
        return new CompetencyEvidenceType();
    }

    /**
     * Create an instance of {@link SpecifiedCompetencyType }
     * 
     */
    public SpecifiedCompetencyType createSpecifiedCompetencyType() {
        return new SpecifiedCompetencyType();
    }

    /**
     * Create an instance of {@link PersonBaseType }
     * 
     */
    public PersonBaseType createPersonBaseType() {
        return new PersonBaseType();
    }

    /**
     * Create an instance of {@link PhoneTypeArray }
     * 
     */
    public PhoneTypeArray createPhoneTypeArray() {
        return new PhoneTypeArray();
    }

    /**
     * Create an instance of {@link DisabilityType }
     * 
     */
    public DisabilityType createDisabilityType() {
        return new DisabilityType();
    }

    /**
     * Create an instance of {@link RemunerationPackageType }
     * 
     */
    public RemunerationPackageType createRemunerationPackageType() {
        return new RemunerationPackageType();
    }

    /**
     * Create an instance of {@link OrganizationAffiliationType }
     * 
     */
    public OrganizationAffiliationType createOrganizationAffiliationType() {
        return new OrganizationAffiliationType();
    }

    /**
     * Create an instance of {@link DataProtectionPolicyInclusion }
     * 
     */
    public DataProtectionPolicyInclusion createDataProtectionPolicyInclusion() {
        return new DataProtectionPolicyInclusion();
    }

    /**
     * Create an instance of {@link DataProtectionPolicyInclusion.DataProtectionPolicy }
     * 
     */
    public DataProtectionPolicyInclusion.DataProtectionPolicy createDataProtectionPolicyInclusionDataProtectionPolicy() {
        return new DataProtectionPolicyInclusion.DataProtectionPolicy();
    }

    /**
     * Create an instance of {@link DataProtectionPolicyInclusion.DataProtectionPolicy.GeoRestrictions }
     * 
     */
    public DataProtectionPolicyInclusion.DataProtectionPolicy.GeoRestrictions createDataProtectionPolicyInclusionDataProtectionPolicyGeoRestrictions() {
        return new DataProtectionPolicyInclusion.DataProtectionPolicy.GeoRestrictions();
    }

    /**
     * Create an instance of {@link BaseHistoryType }
     * 
     */
    public BaseHistoryType createBaseHistoryType() {
        return new BaseHistoryType();
    }

    /**
     * Create an instance of {@link ScoreType }
     * 
     */
    public ScoreType createScoreType() {
        return new ScoreType();
    }

    /**
     * Create an instance of {@link CertificationType }
     * 
     */
    public CertificationType createCertificationType() {
        return new CertificationType();
    }

    /**
     * Create an instance of {@link CandidateType }
     * 
     */
    public CandidateType createCandidateType() {
        return new CandidateType();
    }

    /**
     * Create an instance of {@link CandidateType.DataProtectionPolicy }
     * 
     */
    public CandidateType.DataProtectionPolicy createCandidateTypeDataProtectionPolicy() {
        return new CandidateType.DataProtectionPolicy();
    }

    /**
     * Create an instance of {@link CandidateType.DataProtectionPolicy.GeoRestrictions }
     * 
     */
    public CandidateType.DataProtectionPolicy.GeoRestrictions createCandidateTypeDataProtectionPolicyGeoRestrictions() {
        return new CandidateType.DataProtectionPolicy.GeoRestrictions();
    }

    /**
     * Create an instance of {@link PatentType }
     * 
     */
    public PatentType createPatentType() {
        return new PatentType();
    }

    /**
     * Create an instance of {@link EmploymentPermitType }
     * 
     */
    public EmploymentPermitType createEmploymentPermitType() {
        return new EmploymentPermitType();
    }

    /**
     * Create an instance of {@link RemoteWorkType }
     * 
     */
    public RemoteWorkType createRemoteWorkType() {
        return new RemoteWorkType();
    }

    /**
     * Create an instance of {@link BaseScoreType }
     * 
     */
    public BaseScoreType createBaseScoreType() {
        return new BaseScoreType();
    }

    /**
     * Create an instance of {@link EmployerHistoryType }
     * 
     */
    public EmployerHistoryType createEmployerHistoryType() {
        return new EmployerHistoryType();
    }

    /**
     * Create an instance of {@link PersonCompetencyType }
     * 
     */
    public PersonCompetencyType createPersonCompetencyType() {
        return new PersonCompetencyType();
    }

    /**
     * Create an instance of {@link PersonLegalInclusion }
     * 
     */
    public PersonLegalInclusion createPersonLegalInclusion() {
        return new PersonLegalInclusion();
    }

    /**
     * Create an instance of {@link OrganizationType }
     * 
     */
    public OrganizationType createOrganizationType() {
        return new OrganizationType();
    }

    /**
     * Create an instance of {@link MilitaryServiceType }
     * 
     */
    public MilitaryServiceType createMilitaryServiceType() {
        return new MilitaryServiceType();
    }

    /**
     * Create an instance of {@link PersonProfileInclusion }
     * 
     */
    public PersonProfileInclusion createPersonProfileInclusion() {
        return new PersonProfileInclusion();
    }

    /**
     * Create an instance of {@link PublicationType }
     * 
     */
    public PublicationType createPublicationType() {
        return new PublicationType();
    }

    /**
     * Create an instance of {@link PublicationType.Copyrights }
     * 
     */
    public PublicationType.Copyrights createPublicationTypeCopyrights() {
        return new PublicationType.Copyrights();
    }

    /**
     * Create an instance of {@link PublicationType.Contributors }
     * 
     */
    public PublicationType.Contributors createPublicationTypeContributors() {
        return new PublicationType.Contributors();
    }

    /**
     * Create an instance of {@link ProcessHistoryItemType }
     * 
     */
    public ProcessHistoryItemType createProcessHistoryItemType() {
        return new ProcessHistoryItemType();
    }

    /**
     * Create an instance of {@link NounType }
     * 
     */
    public NounType createNounType() {
        return new NounType();
    }

    /**
     * Create an instance of {@link NounType.DataProtectionPolicy }
     * 
     */
    public NounType.DataProtectionPolicy createNounTypeDataProtectionPolicy() {
        return new NounType.DataProtectionPolicy();
    }

    /**
     * Create an instance of {@link NounType.DataProtectionPolicy.GeoRestrictions }
     * 
     */
    public NounType.DataProtectionPolicy.GeoRestrictions createNounTypeDataProtectionPolicyGeoRestrictions() {
        return new NounType.DataProtectionPolicy.GeoRestrictions();
    }

    /**
     * Create an instance of {@link EducationAttendanceType }
     * 
     */
    public EducationAttendanceType createEducationAttendanceType() {
        return new EducationAttendanceType();
    }

    /**
     * Create an instance of {@link EducationAttendanceType.OtherAttendancePeriods }
     * 
     */
    public EducationAttendanceType.OtherAttendancePeriods createEducationAttendanceTypeOtherAttendancePeriods() {
        return new EducationAttendanceType.OtherAttendancePeriods();
    }

    /**
     * Create an instance of {@link LicenseType }
     * 
     */
    public LicenseType createLicenseType() {
        return new LicenseType();
    }

    /**
     * Create an instance of {@link LicenseType.Violations }
     * 
     */
    public LicenseType.Violations createLicenseTypeViolations() {
        return new LicenseType.Violations();
    }

    /**
     * Create an instance of {@link LicenseType.Restrictions }
     * 
     */
    public LicenseType.Restrictions createLicenseTypeRestrictions() {
        return new LicenseType.Restrictions();
    }

    /**
     * Create an instance of {@link LicenseType.Endorsements }
     * 
     */
    public LicenseType.Endorsements createLicenseTypeEndorsements() {
        return new LicenseType.Endorsements();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link AddressTypeArray }
     * 
     */
    public AddressTypeArray createAddressTypeArray() {
        return new AddressTypeArray();
    }

    /**
     * Create an instance of {@link AddressTypeArray.Item }
     * 
     */
    public AddressTypeArray.Item createAddressTypeArrayItem() {
        return new AddressTypeArray.Item();
    }

    /**
     * Create an instance of {@link AttachmentReferenceType }
     * 
     */
    public AttachmentReferenceType createAttachmentReferenceType() {
        return new AttachmentReferenceType();
    }

    /**
     * Create an instance of {@link EntityType }
     * 
     */
    public EntityType createEntityType() {
        return new EntityType();
    }

    /**
     * Create an instance of {@link AddressComponentType }
     * 
     */
    public AddressComponentType createAddressComponentType() {
        return new AddressComponentType();
    }

    /**
     * Create an instance of {@link StringTypeArray }
     * 
     */
    public StringTypeArray createStringTypeArray() {
        return new StringTypeArray();
    }

    /**
     * Create an instance of {@link ScoreNumericType }
     * 
     */
    public ScoreNumericType createScoreNumericType() {
        return new ScoreNumericType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link YearOpenEndPeriodType }
     * 
     */
    public YearOpenEndPeriodType createYearOpenEndPeriodType() {
        return new YearOpenEndPeriodType();
    }

    /**
     * Create an instance of {@link DateTimePeriodType }
     * 
     */
    public DateTimePeriodType createDateTimePeriodType() {
        return new DateTimePeriodType();
    }

    /**
     * Create an instance of {@link GeoType }
     * 
     */
    public GeoType createGeoType() {
        return new GeoType();
    }

    /**
     * Create an instance of {@link ProcessHistoryType }
     * 
     */
    public ProcessHistoryType createProcessHistoryType() {
        return new ProcessHistoryType();
    }

    /**
     * Create an instance of {@link WebType }
     * 
     */
    public WebType createWebType() {
        return new WebType();
    }

    /**
     * Create an instance of {@link LegalDocumentType }
     * 
     */
    public LegalDocumentType createLegalDocumentType() {
        return new LegalDocumentType();
    }

    /**
     * Create an instance of {@link BinaryObjectType }
     * 
     */
    public BinaryObjectType createBinaryObjectType() {
        return new BinaryObjectType();
    }

    /**
     * Create an instance of {@link CommunicationType }
     * 
     */
    public CommunicationType createCommunicationType() {
        return new CommunicationType();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link LocalizationInclusion }
     * 
     */
    public LocalizationInclusion createLocalizationInclusion() {
        return new LocalizationInclusion();
    }

    /**
     * Create an instance of {@link OpenEndPeriodType }
     * 
     */
    public OpenEndPeriodType createOpenEndPeriodType() {
        return new OpenEndPeriodType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link PersonReferenceType }
     * 
     */
    public PersonReferenceType createPersonReferenceType() {
        return new PersonReferenceType();
    }

    /**
     * Create an instance of {@link EffectiveTimePeriodType }
     * 
     */
    public EffectiveTimePeriodType createEffectiveTimePeriodType() {
        return new EffectiveTimePeriodType();
    }

    /**
     * Create an instance of {@link EventType }
     * 
     */
    public EventType createEventType() {
        return new EventType();
    }

    /**
     * Create an instance of {@link CompetencyDimensionType }
     * 
     */
    public CompetencyDimensionType createCompetencyDimensionType() {
        return new CompetencyDimensionType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link AttachmentType }
     * 
     */
    public AttachmentType createAttachmentType() {
        return new AttachmentType();
    }

    /**
     * Create an instance of {@link DateOpenEndPeriodType }
     * 
     */
    public DateOpenEndPeriodType createDateOpenEndPeriodType() {
        return new DateOpenEndPeriodType();
    }

    /**
     * Create an instance of {@link IdentifierType }
     * 
     */
    public IdentifierType createIdentifierType() {
        return new IdentifierType();
    }

    /**
     * Create an instance of {@link PeriodType }
     * 
     */
    public PeriodType createPeriodType() {
        return new PeriodType();
    }

    /**
     * Create an instance of {@link RemunerationRangeType }
     * 
     */
    public RemunerationRangeType createRemunerationRangeType() {
        return new RemunerationRangeType();
    }

    /**
     * Create an instance of {@link YearMonthPeriodType }
     * 
     */
    public YearMonthPeriodType createYearMonthPeriodType() {
        return new YearMonthPeriodType();
    }

    /**
     * Create an instance of {@link PersonPhysicalInclusion }
     * 
     */
    public PersonPhysicalInclusion createPersonPhysicalInclusion() {
        return new PersonPhysicalInclusion();
    }

    /**
     * Create an instance of {@link DatePeriodType }
     * 
     */
    public DatePeriodType createDatePeriodType() {
        return new DatePeriodType();
    }

    /**
     * Create an instance of {@link SpecifiedPersonType }
     * 
     */
    public SpecifiedPersonType createSpecifiedPersonType() {
        return new SpecifiedPersonType();
    }

    /**
     * Create an instance of {@link PhoneType }
     * 
     */
    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    /**
     * Create an instance of {@link YearPeriodType }
     * 
     */
    public YearPeriodType createYearPeriodType() {
        return new YearPeriodType();
    }

    /**
     * Create an instance of {@link WorkLifeCycleType }
     * 
     */
    public WorkLifeCycleType createWorkLifeCycleType() {
        return new WorkLifeCycleType();
    }

    /**
     * Create an instance of {@link DateTimeOpenEndPeriodType }
     * 
     */
    public DateTimeOpenEndPeriodType createDateTimeOpenEndPeriodType() {
        return new DateTimeOpenEndPeriodType();
    }

    /**
     * Create an instance of {@link RelocationType }
     * 
     */
    public RelocationType createRelocationType() {
        return new RelocationType();
    }

    /**
     * Create an instance of {@link CommentType }
     * 
     */
    public CommentType createCommentType() {
        return new CommentType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link CommunicationItemInclusion }
     * 
     */
    public CommunicationItemInclusion createCommunicationItemInclusion() {
        return new CommunicationItemInclusion();
    }

    /**
     * Create an instance of {@link ScoreTextType }
     * 
     */
    public ScoreTextType createScoreTextType() {
        return new ScoreTextType();
    }

    /**
     * Create an instance of {@link YearMonthOpenEndPeriodType }
     * 
     */
    public YearMonthOpenEndPeriodType createYearMonthOpenEndPeriodType() {
        return new YearMonthOpenEndPeriodType();
    }

    /**
     * Create an instance of {@link TravelType }
     * 
     */
    public TravelType createTravelType() {
        return new TravelType();
    }

    /**
     * Create an instance of {@link OrganizationReferenceType }
     * 
     */
    public OrganizationReferenceType createOrganizationReferenceType() {
        return new OrganizationReferenceType();
    }

    /**
     * Create an instance of {@link LeaveType }
     * 
     */
    public LeaveType createLeaveType() {
        return new LeaveType();
    }

    /**
     * Create an instance of {@link DistributeToType }
     * 
     */
    public DistributeToType createDistributeToType() {
        return new DistributeToType();
    }

    /**
     * Create an instance of {@link ProcessStatusType }
     * 
     */
    public ProcessStatusType createProcessStatusType() {
        return new ProcessStatusType();
    }

    /**
     * Create an instance of {@link DayScheduleType }
     * 
     */
    public DayScheduleType createDayScheduleType() {
        return new DayScheduleType();
    }

    /**
     * Create an instance of {@link ProcessPartyType }
     * 
     */
    public ProcessPartyType createProcessPartyType() {
        return new ProcessPartyType();
    }

    /**
     * Create an instance of {@link ProcessActionType }
     * 
     */
    public ProcessActionType createProcessActionType() {
        return new ProcessActionType();
    }

    /**
     * Create an instance of {@link EducationSpecializationType }
     * 
     */
    public EducationSpecializationType createEducationSpecializationType() {
        return new EducationSpecializationType();
    }

    /**
     * Create an instance of {@link AssociatedPositionOpeningType }
     * 
     */
    public AssociatedPositionOpeningType createAssociatedPositionOpeningType() {
        return new AssociatedPositionOpeningType();
    }

    /**
     * Create an instance of {@link PreferredLocationType }
     * 
     */
    public PreferredLocationType createPreferredLocationType() {
        return new PreferredLocationType();
    }

    /**
     * Create an instance of {@link AttachmentContent }
     * 
     */
    public AttachmentContent createAttachmentContent() {
        return new AttachmentContent();
    }

    /**
     * Create an instance of {@link DoNotDistributeToType }
     * 
     */
    public DoNotDistributeToType createDoNotDistributeToType() {
        return new DoNotDistributeToType();
    }

    /**
     * Create an instance of {@link CandidateRelationshipType }
     * 
     */
    public CandidateRelationshipType createCandidateRelationshipType() {
        return new CandidateRelationshipType();
    }

    /**
     * Create an instance of {@link CandidateSourceType }
     * 
     */
    public CandidateSourceType createCandidateSourceType() {
        return new CandidateSourceType();
    }

    /**
     * Create an instance of {@link DistributionType }
     * 
     */
    public DistributionType createDistributionType() {
        return new DistributionType();
    }

    /**
     * Create an instance of {@link TerminationType }
     * 
     */
    public TerminationType createTerminationType() {
        return new TerminationType();
    }

    /**
     * Create an instance of {@link DispositionStatusType }
     * 
     */
    public DispositionStatusType createDispositionStatusType() {
        return new DispositionStatusType();
    }

    /**
     * Create an instance of {@link AvailabilityDatesType }
     * 
     */
    public AvailabilityDatesType createAvailabilityDatesType() {
        return new AvailabilityDatesType();
    }

    /**
     * Create an instance of {@link CandidatePersonType.Citizenship }
     * 
     */
    public CandidatePersonType.Citizenship createCandidatePersonTypeCitizenship() {
        return new CandidatePersonType.Citizenship();
    }

    /**
     * Create an instance of {@link CandidatePersonType.ResidenceCountry }
     * 
     */
    public CandidatePersonType.ResidenceCountry createCandidatePersonTypeResidenceCountry() {
        return new CandidatePersonType.ResidenceCountry();
    }

    /**
     * Create an instance of {@link CandidatePersonType.Race }
     * 
     */
    public CandidatePersonType.Race createCandidatePersonTypeRace() {
        return new CandidatePersonType.Race();
    }

    /**
     * Create an instance of {@link CandidatePersonType.Nationality }
     * 
     */
    public CandidatePersonType.Nationality createCandidatePersonTypeNationality() {
        return new CandidatePersonType.Nationality();
    }

    /**
     * Create an instance of {@link CandidatePersonType.Visa }
     * 
     */
    public CandidatePersonType.Visa createCandidatePersonTypeVisa() {
        return new CandidatePersonType.Visa();
    }

    /**
     * Create an instance of {@link CandidatePersonType.Religion }
     * 
     */
    public CandidatePersonType.Religion createCandidatePersonTypeReligion() {
        return new CandidatePersonType.Religion();
    }

    /**
     * Create an instance of {@link CandidatePersonType.LegalDocuments }
     * 
     */
    public CandidatePersonType.LegalDocuments createCandidatePersonTypeLegalDocuments() {
        return new CandidatePersonType.LegalDocuments();
    }

    /**
     * Create an instance of {@link CandidatePersonType.EmploymentPermits }
     * 
     */
    public CandidatePersonType.EmploymentPermits createCandidatePersonTypeEmploymentPermits() {
        return new CandidatePersonType.EmploymentPermits();
    }

    /**
     * Create an instance of {@link PositionPreferenceType.Locations }
     * 
     */
    public PositionPreferenceType.Locations createPositionPreferenceTypeLocations() {
        return new PositionPreferenceType.Locations();
    }

    /**
     * Create an instance of {@link PositionPreferenceType.JobCategories }
     * 
     */
    public PositionPreferenceType.JobCategories createPositionPreferenceTypeJobCategories() {
        return new PositionPreferenceType.JobCategories();
    }

    /**
     * Create an instance of {@link PositionPreferenceType.PositionOfferingTypeCodes }
     * 
     */
    public PositionPreferenceType.PositionOfferingTypeCodes createPositionPreferenceTypePositionOfferingTypeCodes() {
        return new PositionPreferenceType.PositionOfferingTypeCodes();
    }

    /**
     * Create an instance of {@link PositionPreferenceType.PositionScheduleTypeCodes }
     * 
     */
    public PositionPreferenceType.PositionScheduleTypeCodes createPositionPreferenceTypePositionScheduleTypeCodes() {
        return new PositionPreferenceType.PositionScheduleTypeCodes();
    }

    /**
     * Create an instance of {@link PositionPreferenceType.ShiftSchedules }
     * 
     */
    public PositionPreferenceType.ShiftSchedules createPositionPreferenceTypeShiftSchedules() {
        return new PositionPreferenceType.ShiftSchedules();
    }

    /**
     * Create an instance of {@link PositionPreferenceType.CareerLevelCodes }
     * 
     */
    public PositionPreferenceType.CareerLevelCodes createPositionPreferenceTypeCareerLevelCodes() {
        return new PositionPreferenceType.CareerLevelCodes();
    }

    /**
     * Create an instance of {@link PositionPreferenceType.WorkingLanguageCodes }
     * 
     */
    public PositionPreferenceType.WorkingLanguageCodes createPositionPreferenceTypeWorkingLanguageCodes() {
        return new PositionPreferenceType.WorkingLanguageCodes();
    }

    /**
     * Create an instance of {@link CandidateProfileType.Education }
     * 
     */
    public CandidateProfileType.Education createCandidateProfileTypeEducation() {
        return new CandidateProfileType.Education();
    }

    /**
     * Create an instance of {@link CandidateProfileType.Employment }
     * 
     */
    public CandidateProfileType.Employment createCandidateProfileTypeEmployment() {
        return new CandidateProfileType.Employment();
    }

    /**
     * Create an instance of {@link CandidateProfileType.MilitaryService }
     * 
     */
    public CandidateProfileType.MilitaryService createCandidateProfileTypeMilitaryService() {
        return new CandidateProfileType.MilitaryService();
    }

    /**
     * Create an instance of {@link CandidateProfileType.Licenses }
     * 
     */
    public CandidateProfileType.Licenses createCandidateProfileTypeLicenses() {
        return new CandidateProfileType.Licenses();
    }

    /**
     * Create an instance of {@link CandidateProfileType.Certifications }
     * 
     */
    public CandidateProfileType.Certifications createCandidateProfileTypeCertifications() {
        return new CandidateProfileType.Certifications();
    }

    /**
     * Create an instance of {@link CandidateProfileType.Patents }
     * 
     */
    public CandidateProfileType.Patents createCandidateProfileTypePatents() {
        return new CandidateProfileType.Patents();
    }

    /**
     * Create an instance of {@link CandidateProfileType.Publications }
     * 
     */
    public CandidateProfileType.Publications createCandidateProfileTypePublications() {
        return new CandidateProfileType.Publications();
    }

    /**
     * Create an instance of {@link CandidateProfileType.Qualifications }
     * 
     */
    public CandidateProfileType.Qualifications createCandidateProfileTypeQualifications() {
        return new CandidateProfileType.Qualifications();
    }

    /**
     * Create an instance of {@link CandidateProfileType.Affiliations }
     * 
     */
    public CandidateProfileType.Affiliations createCandidateProfileTypeAffiliations() {
        return new CandidateProfileType.Affiliations();
    }

    /**
     * Create an instance of {@link CandidateProfileType.SecurityCredentials }
     * 
     */
    public CandidateProfileType.SecurityCredentials createCandidateProfileTypeSecurityCredentials() {
        return new CandidateProfileType.SecurityCredentials();
    }

    /**
     * Create an instance of {@link CandidateProfileType.References }
     * 
     */
    public CandidateProfileType.References createCandidateProfileTypeReferences() {
        return new CandidateProfileType.References();
    }

    /**
     * Create an instance of {@link CandidateProfileType.Attachments }
     * 
     */
    public CandidateProfileType.Attachments createCandidateProfileTypeAttachments() {
        return new CandidateProfileType.Attachments();
    }

    /**
     * Create an instance of {@link CandidateProfileType.AlternateIds }
     * 
     */
    public CandidateProfileType.AlternateIds createCandidateProfileTypeAlternateIds() {
        return new CandidateProfileType.AlternateIds();
    }

    /**
     * Create an instance of {@link CandidateProfileType.AssociatedPositionOpenings }
     * 
     */
    public CandidateProfileType.AssociatedPositionOpenings createCandidateProfileTypeAssociatedPositionOpenings() {
        return new CandidateProfileType.AssociatedPositionOpenings();
    }

    /**
     * Create an instance of {@link CandidateProfileType.EmployerPreferences }
     * 
     */
    public CandidateProfileType.EmployerPreferences createCandidateProfileTypeEmployerPreferences() {
        return new CandidateProfileType.EmployerPreferences();
    }

    /**
     * Create an instance of {@link CandidateProfileType.PositionPreferences }
     * 
     */
    public CandidateProfileType.PositionPreferences createCandidateProfileTypePositionPreferences() {
        return new CandidateProfileType.PositionPreferences();
    }

    /**
     * Create an instance of {@link CandidateProfileType.CandidateRelationships }
     * 
     */
    public CandidateProfileType.CandidateRelationships createCandidateProfileTypeCandidateRelationships() {
        return new CandidateProfileType.CandidateRelationships();
    }

    /**
     * Create an instance of {@link CandidateProfileType.CandidateSources }
     * 
     */
    public CandidateProfileType.CandidateSources createCandidateProfileTypeCandidateSources() {
        return new CandidateProfileType.CandidateSources();
    }

    /**
     * Create an instance of {@link CandidateProfileType.WorkLifeCycles }
     * 
     */
    public CandidateProfileType.WorkLifeCycles createCandidateProfileTypeWorkLifeCycles() {
        return new CandidateProfileType.WorkLifeCycles();
    }

    /**
     * Create an instance of {@link ContractType.Addendum }
     * 
     */
    public ContractType.Addendum createContractTypeAddendum() {
        return new ContractType.Addendum();
    }

    /**
     * Create an instance of {@link DisabilitySummaryType.AccommodationTypeCode }
     * 
     */
    public DisabilitySummaryType.AccommodationTypeCode createDisabilitySummaryTypeAccommodationTypeCode() {
        return new DisabilitySummaryType.AccommodationTypeCode();
    }

    /**
     * Create an instance of {@link DisabilitySummaryType.Attachments }
     * 
     */
    public DisabilitySummaryType.Attachments createDisabilitySummaryTypeAttachments() {
        return new DisabilitySummaryType.Attachments();
    }

    /**
     * Create an instance of {@link DisabilitySummaryType.AttachmentReferences }
     * 
     */
    public DisabilitySummaryType.AttachmentReferences createDisabilitySummaryTypeAttachmentReferences() {
        return new DisabilitySummaryType.AttachmentReferences();
    }

    /**
     * Create an instance of {@link EducationDegreeType.Codes }
     * 
     */
    public EducationDegreeType.Codes createEducationDegreeTypeCodes() {
        return new EducationDegreeType.Codes();
    }

    /**
     * Create an instance of {@link EducationDegreeType.Specializations }
     * 
     */
    public EducationDegreeType.Specializations createEducationDegreeTypeSpecializations() {
        return new EducationDegreeType.Specializations();
    }

    /**
     * Create an instance of {@link DistributionGuidelinesType.DistributeTo }
     * 
     */
    public DistributionGuidelinesType.DistributeTo createDistributionGuidelinesTypeDistributeTo() {
        return new DistributionGuidelinesType.DistributeTo();
    }

    /**
     * Create an instance of {@link DistributionGuidelinesType.DoNotDistributeTo }
     * 
     */
    public DistributionGuidelinesType.DoNotDistributeTo createDistributionGuidelinesTypeDoNotDistributeTo() {
        return new DistributionGuidelinesType.DoNotDistributeTo();
    }

    /**
     * Create an instance of {@link PositionHistoryType.AttachmentReferences }
     * 
     */
    public PositionHistoryType.AttachmentReferences createPositionHistoryTypeAttachmentReferences() {
        return new PositionHistoryType.AttachmentReferences();
    }

    /**
     * Create an instance of {@link PositionHistoryType.JobCategories }
     * 
     */
    public PositionHistoryType.JobCategories createPositionHistoryTypeJobCategories() {
        return new PositionHistoryType.JobCategories();
    }

    /**
     * Create an instance of {@link PositionHistoryType.JobLevels }
     * 
     */
    public PositionHistoryType.JobLevels createPositionHistoryTypeJobLevels() {
        return new PositionHistoryType.JobLevels();
    }

    /**
     * Create an instance of {@link HireType.ServiceStartDates }
     * 
     */
    public HireType.ServiceStartDates createHireTypeServiceStartDates() {
        return new HireType.ServiceStartDates();
    }

    /**
     * Create an instance of {@link RecruitingAndStaffingType.InterviewDates }
     * 
     */
    public RecruitingAndStaffingType.InterviewDates createRecruitingAndStaffingTypeInterviewDates() {
        return new RecruitingAndStaffingType.InterviewDates();
    }

    /**
     * Create an instance of {@link PersonAvailabilityType.AvailabilityDates }
     * 
     */
    public PersonAvailabilityType.AvailabilityDates createPersonAvailabilityTypeAvailabilityDates() {
        return new PersonAvailabilityType.AvailabilityDates();
    }

    /**
     * Create an instance of {@link EmployerPreferenceType.IndustryCodes }
     * 
     */
    public EmployerPreferenceType.IndustryCodes createEmployerPreferenceTypeIndustryCodes() {
        return new EmployerPreferenceType.IndustryCodes();
    }

    /**
     * Create an instance of {@link EmployerPreferenceType.HeadcountRange }
     * 
     */
    public EmployerPreferenceType.HeadcountRange createEmployerPreferenceTypeHeadcountRange() {
        return new EmployerPreferenceType.HeadcountRange();
    }

    /**
     * Create an instance of {@link LocationType.ExtendedLines }
     * 
     */
    public LocationType.ExtendedLines createLocationTypeExtendedLines() {
        return new LocationType.ExtendedLines();
    }

    /**
     * Create an instance of {@link LocationType.CountrySubDivisions }
     * 
     */
    public LocationType.CountrySubDivisions createLocationTypeCountrySubDivisions() {
        return new LocationType.CountrySubDivisions();
    }

    /**
     * Create an instance of {@link EmailTypeArray.Item }
     * 
     */
    public EmailTypeArray.Item createEmailTypeArrayItem() {
        return new EmailTypeArray.Item();
    }

    /**
     * Create an instance of {@link ScheduleType.Schedules }
     * 
     */
    public ScheduleType.Schedules createScheduleTypeSchedules() {
        return new ScheduleType.Schedules();
    }

    /**
     * Create an instance of {@link RefereeType.AttachmentReferences }
     * 
     */
    public RefereeType.AttachmentReferences createRefereeTypeAttachmentReferences() {
        return new RefereeType.AttachmentReferences();
    }

    /**
     * Create an instance of {@link RefereeType.Comments }
     * 
     */
    public RefereeType.Comments createRefereeTypeComments() {
        return new RefereeType.Comments();
    }

    /**
     * Create an instance of {@link WebTypeArray.Item }
     * 
     */
    public WebTypeArray.Item createWebTypeArrayItem() {
        return new WebTypeArray.Item();
    }

    /**
     * Create an instance of {@link CompetencyEvidenceType.Ids }
     * 
     */
    public CompetencyEvidenceType.Ids createCompetencyEvidenceTypeIds() {
        return new CompetencyEvidenceType.Ids();
    }

    /**
     * Create an instance of {@link CompetencyEvidenceType.Scores }
     * 
     */
    public CompetencyEvidenceType.Scores createCompetencyEvidenceTypeScores() {
        return new CompetencyEvidenceType.Scores();
    }

    /**
     * Create an instance of {@link SpecifiedCompetencyType.CompetencyIds }
     * 
     */
    public SpecifiedCompetencyType.CompetencyIds createSpecifiedCompetencyTypeCompetencyIds() {
        return new SpecifiedCompetencyType.CompetencyIds();
    }

    /**
     * Create an instance of {@link PersonBaseType.Citizenship }
     * 
     */
    public PersonBaseType.Citizenship createPersonBaseTypeCitizenship() {
        return new PersonBaseType.Citizenship();
    }

    /**
     * Create an instance of {@link PersonBaseType.ResidenceCountry }
     * 
     */
    public PersonBaseType.ResidenceCountry createPersonBaseTypeResidenceCountry() {
        return new PersonBaseType.ResidenceCountry();
    }

    /**
     * Create an instance of {@link PhoneTypeArray.Item }
     * 
     */
    public PhoneTypeArray.Item createPhoneTypeArrayItem() {
        return new PhoneTypeArray.Item();
    }

    /**
     * Create an instance of {@link DisabilityType.Summary }
     * 
     */
    public DisabilityType.Summary createDisabilityTypeSummary() {
        return new DisabilityType.Summary();
    }

    /**
     * Create an instance of {@link RemunerationPackageType.Ranges }
     * 
     */
    public RemunerationPackageType.Ranges createRemunerationPackageTypeRanges() {
        return new RemunerationPackageType.Ranges();
    }

    /**
     * Create an instance of {@link OrganizationAffiliationType.AttachmentReferences }
     * 
     */
    public OrganizationAffiliationType.AttachmentReferences createOrganizationAffiliationTypeAttachmentReferences() {
        return new OrganizationAffiliationType.AttachmentReferences();
    }

    /**
     * Create an instance of {@link DataProtectionPolicyInclusion.DataProtectionPolicy.GeoRestrictions.Item }
     * 
     */
    public DataProtectionPolicyInclusion.DataProtectionPolicy.GeoRestrictions.Item createDataProtectionPolicyInclusionDataProtectionPolicyGeoRestrictionsItem() {
        return new DataProtectionPolicyInclusion.DataProtectionPolicy.GeoRestrictions.Item();
    }

    /**
     * Create an instance of {@link BaseHistoryType.AttachmentReferences }
     * 
     */
    public BaseHistoryType.AttachmentReferences createBaseHistoryTypeAttachmentReferences() {
        return new BaseHistoryType.AttachmentReferences();
    }

    /**
     * Create an instance of {@link ScoreType.ScoresNumeric }
     * 
     */
    public ScoreType.ScoresNumeric createScoreTypeScoresNumeric() {
        return new ScoreType.ScoresNumeric();
    }

    /**
     * Create an instance of {@link ScoreType.ScoresText }
     * 
     */
    public ScoreType.ScoresText createScoreTypeScoresText() {
        return new ScoreType.ScoresText();
    }

    /**
     * Create an instance of {@link CertificationType.AttachmentReferences }
     * 
     */
    public CertificationType.AttachmentReferences createCertificationTypeAttachmentReferences() {
        return new CertificationType.AttachmentReferences();
    }

    /**
     * Create an instance of {@link CandidateType.AlternateIds }
     * 
     */
    public CandidateType.AlternateIds createCandidateTypeAlternateIds() {
        return new CandidateType.AlternateIds();
    }

    /**
     * Create an instance of {@link CandidateType.Profiles }
     * 
     */
    public CandidateType.Profiles createCandidateTypeProfiles() {
        return new CandidateType.Profiles();
    }

    /**
     * Create an instance of {@link CandidateType.DataProtectionPolicy.GeoRestrictions.Item }
     * 
     */
    public CandidateType.DataProtectionPolicy.GeoRestrictions.Item createCandidateTypeDataProtectionPolicyGeoRestrictionsItem() {
        return new CandidateType.DataProtectionPolicy.GeoRestrictions.Item();
    }

    /**
     * Create an instance of {@link PatentType.Ids }
     * 
     */
    public PatentType.Ids createPatentTypeIds() {
        return new PatentType.Ids();
    }

    /**
     * Create an instance of {@link PatentType.AttachmentReferences }
     * 
     */
    public PatentType.AttachmentReferences createPatentTypeAttachmentReferences() {
        return new PatentType.AttachmentReferences();
    }

    /**
     * Create an instance of {@link EmploymentPermitType.AttachmentReferences }
     * 
     */
    public EmploymentPermitType.AttachmentReferences createEmploymentPermitTypeAttachmentReferences() {
        return new EmploymentPermitType.AttachmentReferences();
    }

    /**
     * Create an instance of {@link EmploymentPermitType.CountrySubDivisions }
     * 
     */
    public EmploymentPermitType.CountrySubDivisions createEmploymentPermitTypeCountrySubDivisions() {
        return new EmploymentPermitType.CountrySubDivisions();
    }

    /**
     * Create an instance of {@link RemoteWorkType.WorkLocationCodes }
     * 
     */
    public RemoteWorkType.WorkLocationCodes createRemoteWorkTypeWorkLocationCodes() {
        return new RemoteWorkType.WorkLocationCodes();
    }

    /**
     * Create an instance of {@link RemoteWorkType.RestrictionCodes }
     * 
     */
    public RemoteWorkType.RestrictionCodes createRemoteWorkTypeRestrictionCodes() {
        return new RemoteWorkType.RestrictionCodes();
    }

    /**
     * Create an instance of {@link BaseScoreType.ScoresNumeric }
     * 
     */
    public BaseScoreType.ScoresNumeric createBaseScoreTypeScoresNumeric() {
        return new BaseScoreType.ScoresNumeric();
    }

    /**
     * Create an instance of {@link BaseScoreType.ScoresText }
     * 
     */
    public BaseScoreType.ScoresText createBaseScoreTypeScoresText() {
        return new BaseScoreType.ScoresText();
    }

    /**
     * Create an instance of {@link EmployerHistoryType.AttachmentReferences }
     * 
     */
    public EmployerHistoryType.AttachmentReferences createEmployerHistoryTypeAttachmentReferences() {
        return new EmployerHistoryType.AttachmentReferences();
    }

    /**
     * Create an instance of {@link EmployerHistoryType.PositionHistories }
     * 
     */
    public EmployerHistoryType.PositionHistories createEmployerHistoryTypePositionHistories() {
        return new EmployerHistoryType.PositionHistories();
    }

    /**
     * Create an instance of {@link PersonCompetencyType.CompetencyIds }
     * 
     */
    public PersonCompetencyType.CompetencyIds createPersonCompetencyTypeCompetencyIds() {
        return new PersonCompetencyType.CompetencyIds();
    }

    /**
     * Create an instance of {@link PersonCompetencyType.CompetencyDimensions }
     * 
     */
    public PersonCompetencyType.CompetencyDimensions createPersonCompetencyTypeCompetencyDimensions() {
        return new PersonCompetencyType.CompetencyDimensions();
    }

    /**
     * Create an instance of {@link PersonCompetencyType.AttachmentReferences }
     * 
     */
    public PersonCompetencyType.AttachmentReferences createPersonCompetencyTypeAttachmentReferences() {
        return new PersonCompetencyType.AttachmentReferences();
    }

    /**
     * Create an instance of {@link PersonLegalInclusion.Race }
     * 
     */
    public PersonLegalInclusion.Race createPersonLegalInclusionRace() {
        return new PersonLegalInclusion.Race();
    }

    /**
     * Create an instance of {@link PersonLegalInclusion.Nationality }
     * 
     */
    public PersonLegalInclusion.Nationality createPersonLegalInclusionNationality() {
        return new PersonLegalInclusion.Nationality();
    }

    /**
     * Create an instance of {@link PersonLegalInclusion.Visa }
     * 
     */
    public PersonLegalInclusion.Visa createPersonLegalInclusionVisa() {
        return new PersonLegalInclusion.Visa();
    }

    /**
     * Create an instance of {@link PersonLegalInclusion.Religion }
     * 
     */
    public PersonLegalInclusion.Religion createPersonLegalInclusionReligion() {
        return new PersonLegalInclusion.Religion();
    }

    /**
     * Create an instance of {@link PersonLegalInclusion.LegalDocuments }
     * 
     */
    public PersonLegalInclusion.LegalDocuments createPersonLegalInclusionLegalDocuments() {
        return new PersonLegalInclusion.LegalDocuments();
    }

    /**
     * Create an instance of {@link PersonLegalInclusion.EmploymentPermits }
     * 
     */
    public PersonLegalInclusion.EmploymentPermits createPersonLegalInclusionEmploymentPermits() {
        return new PersonLegalInclusion.EmploymentPermits();
    }

    /**
     * Create an instance of {@link OrganizationType.IndustryCodes }
     * 
     */
    public OrganizationType.IndustryCodes createOrganizationTypeIndustryCodes() {
        return new OrganizationType.IndustryCodes();
    }

    /**
     * Create an instance of {@link OrganizationType.IndustryIdentifiers }
     * 
     */
    public OrganizationType.IndustryIdentifiers createOrganizationTypeIndustryIdentifiers() {
        return new OrganizationType.IndustryIdentifiers();
    }

    /**
     * Create an instance of {@link OrganizationType.Contacts }
     * 
     */
    public OrganizationType.Contacts createOrganizationTypeContacts() {
        return new OrganizationType.Contacts();
    }

    /**
     * Create an instance of {@link MilitaryServiceType.AttachmentReferences }
     * 
     */
    public MilitaryServiceType.AttachmentReferences createMilitaryServiceTypeAttachmentReferences() {
        return new MilitaryServiceType.AttachmentReferences();
    }

    /**
     * Create an instance of {@link MilitaryServiceType.Expertises }
     * 
     */
    public MilitaryServiceType.Expertises createMilitaryServiceTypeExpertises() {
        return new MilitaryServiceType.Expertises();
    }

    /**
     * Create an instance of {@link MilitaryServiceType.Comments }
     * 
     */
    public MilitaryServiceType.Comments createMilitaryServiceTypeComments() {
        return new MilitaryServiceType.Comments();
    }

    /**
     * Create an instance of {@link PersonProfileInclusion.Education }
     * 
     */
    public PersonProfileInclusion.Education createPersonProfileInclusionEducation() {
        return new PersonProfileInclusion.Education();
    }

    /**
     * Create an instance of {@link PersonProfileInclusion.Employment }
     * 
     */
    public PersonProfileInclusion.Employment createPersonProfileInclusionEmployment() {
        return new PersonProfileInclusion.Employment();
    }

    /**
     * Create an instance of {@link PersonProfileInclusion.MilitaryService }
     * 
     */
    public PersonProfileInclusion.MilitaryService createPersonProfileInclusionMilitaryService() {
        return new PersonProfileInclusion.MilitaryService();
    }

    /**
     * Create an instance of {@link PersonProfileInclusion.Licenses }
     * 
     */
    public PersonProfileInclusion.Licenses createPersonProfileInclusionLicenses() {
        return new PersonProfileInclusion.Licenses();
    }

    /**
     * Create an instance of {@link PersonProfileInclusion.Certifications }
     * 
     */
    public PersonProfileInclusion.Certifications createPersonProfileInclusionCertifications() {
        return new PersonProfileInclusion.Certifications();
    }

    /**
     * Create an instance of {@link PersonProfileInclusion.Patents }
     * 
     */
    public PersonProfileInclusion.Patents createPersonProfileInclusionPatents() {
        return new PersonProfileInclusion.Patents();
    }

    /**
     * Create an instance of {@link PersonProfileInclusion.Publications }
     * 
     */
    public PersonProfileInclusion.Publications createPersonProfileInclusionPublications() {
        return new PersonProfileInclusion.Publications();
    }

    /**
     * Create an instance of {@link PersonProfileInclusion.Qualifications }
     * 
     */
    public PersonProfileInclusion.Qualifications createPersonProfileInclusionQualifications() {
        return new PersonProfileInclusion.Qualifications();
    }

    /**
     * Create an instance of {@link PersonProfileInclusion.Affiliations }
     * 
     */
    public PersonProfileInclusion.Affiliations createPersonProfileInclusionAffiliations() {
        return new PersonProfileInclusion.Affiliations();
    }

    /**
     * Create an instance of {@link PersonProfileInclusion.SecurityCredentials }
     * 
     */
    public PersonProfileInclusion.SecurityCredentials createPersonProfileInclusionSecurityCredentials() {
        return new PersonProfileInclusion.SecurityCredentials();
    }

    /**
     * Create an instance of {@link PersonProfileInclusion.References }
     * 
     */
    public PersonProfileInclusion.References createPersonProfileInclusionReferences() {
        return new PersonProfileInclusion.References();
    }

    /**
     * Create an instance of {@link PersonProfileInclusion.Attachments }
     * 
     */
    public PersonProfileInclusion.Attachments createPersonProfileInclusionAttachments() {
        return new PersonProfileInclusion.Attachments();
    }

    /**
     * Create an instance of {@link PublicationType.AttachmentReferences }
     * 
     */
    public PublicationType.AttachmentReferences createPublicationTypeAttachmentReferences() {
        return new PublicationType.AttachmentReferences();
    }

    /**
     * Create an instance of {@link PublicationType.Comments }
     * 
     */
    public PublicationType.Comments createPublicationTypeComments() {
        return new PublicationType.Comments();
    }

    /**
     * Create an instance of {@link PublicationType.Copyrights.Item }
     * 
     */
    public PublicationType.Copyrights.Item createPublicationTypeCopyrightsItem() {
        return new PublicationType.Copyrights.Item();
    }

    /**
     * Create an instance of {@link PublicationType.Contributors.Item }
     * 
     */
    public PublicationType.Contributors.Item createPublicationTypeContributorsItem() {
        return new PublicationType.Contributors.Item();
    }

    /**
     * Create an instance of {@link ProcessHistoryItemType.PrimaryParties }
     * 
     */
    public ProcessHistoryItemType.PrimaryParties createProcessHistoryItemTypePrimaryParties() {
        return new ProcessHistoryItemType.PrimaryParties();
    }

    /**
     * Create an instance of {@link ProcessHistoryItemType.AssociatedParties }
     * 
     */
    public ProcessHistoryItemType.AssociatedParties createProcessHistoryItemTypeAssociatedParties() {
        return new ProcessHistoryItemType.AssociatedParties();
    }

    /**
     * Create an instance of {@link ProcessHistoryItemType.Attachments }
     * 
     */
    public ProcessHistoryItemType.Attachments createProcessHistoryItemTypeAttachments() {
        return new ProcessHistoryItemType.Attachments();
    }

    /**
     * Create an instance of {@link NounType.AlternateIds }
     * 
     */
    public NounType.AlternateIds createNounTypeAlternateIds() {
        return new NounType.AlternateIds();
    }

    /**
     * Create an instance of {@link NounType.DataProtectionPolicy.GeoRestrictions.Item }
     * 
     */
    public NounType.DataProtectionPolicy.GeoRestrictions.Item createNounTypeDataProtectionPolicyGeoRestrictionsItem() {
        return new NounType.DataProtectionPolicy.GeoRestrictions.Item();
    }

    /**
     * Create an instance of {@link EducationAttendanceType.AttachmentReferences }
     * 
     */
    public EducationAttendanceType.AttachmentReferences createEducationAttendanceTypeAttachmentReferences() {
        return new EducationAttendanceType.AttachmentReferences();
    }

    /**
     * Create an instance of {@link EducationAttendanceType.EducationLevelCodes }
     * 
     */
    public EducationAttendanceType.EducationLevelCodes createEducationAttendanceTypeEducationLevelCodes() {
        return new EducationAttendanceType.EducationLevelCodes();
    }

    /**
     * Create an instance of {@link EducationAttendanceType.EducationDegrees }
     * 
     */
    public EducationAttendanceType.EducationDegrees createEducationAttendanceTypeEducationDegrees() {
        return new EducationAttendanceType.EducationDegrees();
    }

    /**
     * Create an instance of {@link EducationAttendanceType.OtherAttendancePeriods.Item }
     * 
     */
    public EducationAttendanceType.OtherAttendancePeriods.Item createEducationAttendanceTypeOtherAttendancePeriodsItem() {
        return new EducationAttendanceType.OtherAttendancePeriods.Item();
    }

    /**
     * Create an instance of {@link LicenseType.AttachmentReferences }
     * 
     */
    public se.arbetsformedlingen.matchning.portability.model.hropen.LicenseType.AttachmentReferences createLicenseTypeAttachmentReferences() {
        return new LicenseType.AttachmentReferences();
    }

    /**
     * Create an instance of {@link LicenseType.Violations.Item }
     * 
     */
    public LicenseType.Violations.Item createLicenseTypeViolationsItem() {
        return new LicenseType.Violations.Item();
    }

    /**
     * Create an instance of {@link LicenseType.Restrictions.Item }
     * 
     */
    public LicenseType.Restrictions.Item createLicenseTypeRestrictionsItem() {
        return new LicenseType.Restrictions.Item();
    }

    /**
     * Create an instance of {@link LicenseType.Endorsements.Item }
     * 
     */
    public LicenseType.Endorsements.Item createLicenseTypeEndorsementsItem() {
        return new LicenseType.Endorsements.Item();
    }

    /**
     * Create an instance of {@link AddressType.ExtendedLines }
     * 
     */
    public AddressType.ExtendedLines createAddressTypeExtendedLines() {
        return new AddressType.ExtendedLines();
    }

    /**
     * Create an instance of {@link AddressType.CountrySubDivisions }
     * 
     */
    public AddressType.CountrySubDivisions createAddressTypeCountrySubDivisions() {
        return new AddressType.CountrySubDivisions();
    }

    /**
     * Create an instance of {@link AddressTypeArray.Item.ExtendedLines }
     * 
     */
    public AddressTypeArray.Item.ExtendedLines createAddressTypeArrayItemExtendedLines() {
        return new AddressTypeArray.Item.ExtendedLines();
    }

    /**
     * Create an instance of {@link AddressTypeArray.Item.CountrySubDivisions }
     * 
     */
    public AddressTypeArray.Item.CountrySubDivisions createAddressTypeArrayItemCountrySubDivisions() {
        return new AddressTypeArray.Item.CountrySubDivisions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "CurrencyCode")
    public JAXBElement<CurrencyCodeList> createCurrencyCode(CurrencyCodeList value) {
        return new JAXBElement<CurrencyCodeList>(_CurrencyCode_QNAME, CurrencyCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CareerLevelCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "CareerLevelCode")
    public JAXBElement<CareerLevelCodeList> createCareerLevelCode(CareerLevelCodeList value) {
        return new JAXBElement<CareerLevelCodeList>(_CareerLevelCode_QNAME, CareerLevelCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreNumericType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "ScoreNumeric")
    public JAXBElement<ScoreNumericType> createScoreNumeric(ScoreNumericType value) {
        return new JAXBElement<ScoreNumericType>(_ScoreNumeric_QNAME, ScoreNumericType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringTypeArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "StringArray")
    public JAXBElement<StringTypeArray> createStringArray(StringTypeArray value) {
        return new JAXBElement<StringTypeArray>(_StringArray_QNAME, StringTypeArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeekdayCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "WeekdayCode")
    public JAXBElement<WeekdayCodeList> createWeekdayCode(WeekdayCodeList value) {
        return new JAXBElement<WeekdayCodeList>(_WeekdayCode_QNAME, WeekdayCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Measure")
    public JAXBElement<MeasureType> createMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_Measure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EducationAttendanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "EducationAttendance")
    public JAXBElement<EducationAttendanceType> createEducationAttendance(EducationAttendanceType value) {
        return new JAXBElement<EducationAttendanceType>(_EducationAttendance_QNAME, EducationAttendanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NounType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Noun")
    public JAXBElement<NounType> createNoun(NounType value) {
        return new JAXBElement<NounType>(_Noun_QNAME, NounType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Entity")
    public JAXBElement<EntityType> createEntity(EntityType value) {
        return new JAXBElement<EntityType>(_Entity_QNAME, EntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressTypeArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "AddressArray")
    public JAXBElement<AddressTypeArray> createAddressArray(AddressTypeArray value) {
        return new JAXBElement<AddressTypeArray>(_AddressArray_QNAME, AddressTypeArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "AttachmentReference")
    public JAXBElement<AttachmentReferenceType> createAttachmentReference(AttachmentReferenceType value) {
        return new JAXBElement<AttachmentReferenceType>(_AttachmentReference_QNAME, AttachmentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemunerationBasisCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "RemunerationBasisCode")
    public JAXBElement<RemunerationBasisCodeList> createRemunerationBasisCode(RemunerationBasisCodeList value) {
        return new JAXBElement<RemunerationBasisCodeList>(_RemunerationBasisCode_QNAME, RemunerationBasisCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressComponentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "AddressComponent")
    public JAXBElement<AddressComponentType> createAddressComponent(AddressComponentType value) {
        return new JAXBElement<AddressComponentType>(_AddressComponent_QNAME, AddressComponentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "License")
    public JAXBElement<LicenseType> createLicense(LicenseType value) {
        return new JAXBElement<LicenseType>(_License_QNAME, LicenseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "DateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessHistoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "ProcessHistory")
    public JAXBElement<ProcessHistoryType> createProcessHistory(ProcessHistoryType value) {
        return new JAXBElement<ProcessHistoryType>(_ProcessHistory_QNAME, ProcessHistoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Geo")
    public JAXBElement<GeoType> createGeo(GeoType value) {
        return new JAXBElement<GeoType>(_Geo_QNAME, GeoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonProfileInclusion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "PersonProfileInclusion")
    public JAXBElement<PersonProfileInclusion> createPersonProfileInclusion(PersonProfileInclusion value) {
        return new JAXBElement<PersonProfileInclusion>(_PersonProfileInclusion_QNAME, PersonProfileInclusion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Web")
    public JAXBElement<WebType> createWeb(WebType value) {
        return new JAXBElement<WebType>(_Web_QNAME, WebType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MilitaryServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "MilitaryService")
    public JAXBElement<MilitaryServiceType> createMilitaryService(MilitaryServiceType value) {
        return new JAXBElement<MilitaryServiceType>(_MilitaryService_QNAME, MilitaryServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "LegalDocument")
    public JAXBElement<LegalDocumentType> createLegalDocument(LegalDocumentType value) {
        return new JAXBElement<LegalDocumentType>(_LegalDocument_QNAME, LegalDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessHistoryItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "ProcessHistoryItem")
    public JAXBElement<ProcessHistoryItemType> createProcessHistoryItem(ProcessHistoryItemType value) {
        return new JAXBElement<ProcessHistoryItemType>(_ProcessHistoryItem_QNAME, ProcessHistoryItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearOpenEndPeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "YearOpenEndPeriod")
    public JAXBElement<YearOpenEndPeriodType> createYearOpenEndPeriod(YearOpenEndPeriodType value) {
        return new JAXBElement<YearOpenEndPeriodType>(_YearOpenEndPeriod_QNAME, YearOpenEndPeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Publication")
    public JAXBElement<PublicationType> createPublication(PublicationType value) {
        return new JAXBElement<PublicationType>(_Publication_QNAME, PublicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffiliatedOrganizationTypeCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "AffiliatedOrganizationTypeCode")
    public JAXBElement<AffiliatedOrganizationTypeCodeList> createAffiliatedOrganizationTypeCode(AffiliatedOrganizationTypeCodeList value) {
        return new JAXBElement<AffiliatedOrganizationTypeCodeList>(_AffiliatedOrganizationTypeCode_QNAME, AffiliatedOrganizationTypeCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Code")
    public JAXBElement<String> createCode(String value) {
        return new JAXBElement<String>(_Code_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimePeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "DateTimePeriod")
    public JAXBElement<DateTimePeriodType> createDateTimePeriod(DateTimePeriodType value) {
        return new JAXBElement<DateTimePeriodType>(_DateTimePeriod_QNAME, DateTimePeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "FormattedDateTime")
    public JAXBElement<String> createFormattedDateTime(String value) {
        return new JAXBElement<String>(_FormattedDateTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CandidateRelationshipCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "CandidateRelationshipCode")
    public JAXBElement<CandidateRelationshipCodeList> createCandidateRelationshipCode(CandidateRelationshipCodeList value) {
        return new JAXBElement<CandidateRelationshipCodeList>(_CandidateRelationshipCode_QNAME, CandidateRelationshipCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "BinaryObject")
    public JAXBElement<BinaryObjectType> createBinaryObject(BinaryObjectType value) {
        return new JAXBElement<BinaryObjectType>(_BinaryObject_QNAME, BinaryObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Communication")
    public JAXBElement<CommunicationType> createCommunication(CommunicationType value) {
        return new JAXBElement<CommunicationType>(_Communication_QNAME, CommunicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "BaseScore")
    public JAXBElement<BaseScoreType> createBaseScore(BaseScoreType value) {
        return new JAXBElement<BaseScoreType>(_BaseScore_QNAME, BaseScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Organization")
    public JAXBElement<OrganizationType> createOrganization(OrganizationType value) {
        return new JAXBElement<OrganizationType>(_Organization_QNAME, OrganizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonLegalInclusion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "PersonLegalInclusion")
    public JAXBElement<PersonLegalInclusion> createPersonLegalInclusion(PersonLegalInclusion value) {
        return new JAXBElement<PersonLegalInclusion>(_PersonLegalInclusion_QNAME, PersonLegalInclusion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonCompetencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "PersonCompetency")
    public JAXBElement<PersonCompetencyType> createPersonCompetency(PersonCompetencyType value) {
        return new JAXBElement<PersonCompetencyType>(_PersonCompetency_QNAME, PersonCompetencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployerHistoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "EmployerHistory")
    public JAXBElement<EmployerHistoryType> createEmployerHistory(EmployerHistoryType value) {
        return new JAXBElement<EmployerHistoryType>(_EmployerHistory_QNAME, EmployerHistoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteWorkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "RemoteWork")
    public JAXBElement<RemoteWorkType> createRemoteWork(RemoteWorkType value) {
        return new JAXBElement<RemoteWorkType>(_RemoteWork_QNAME, RemoteWorkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationshipTypeCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "RelationshipTypeCode")
    public JAXBElement<RelationshipTypeCodeList> createRelationshipTypeCode(RelationshipTypeCodeList value) {
        return new JAXBElement<RelationshipTypeCodeList>(_RelationshipTypeCode_QNAME, RelationshipTypeCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EffectiveTimePeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "EffectiveTimePeriod")
    public JAXBElement<EffectiveTimePeriodType> createEffectiveTimePeriod(EffectiveTimePeriodType value) {
        return new JAXBElement<EffectiveTimePeriodType>(_EffectiveTimePeriod_QNAME, EffectiveTimePeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Year")
    public JAXBElement<XMLGregorianCalendar> createYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Year_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Event")
    public JAXBElement<EventType> createEvent(EventType value) {
        return new JAXBElement<EventType>(_Event_QNAME, EventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceRelationshipCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "ResourceRelationshipCode")
    public JAXBElement<ResourceRelationshipCodeList> createResourceRelationshipCode(ResourceRelationshipCodeList value) {
        return new JAXBElement<ResourceRelationshipCodeList>(_ResourceRelationshipCode_QNAME, ResourceRelationshipCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Amount")
    public JAXBElement<AmountType> createAmount(AmountType value) {
        return new JAXBElement<AmountType>(_Amount_QNAME, AmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "PersonReference")
    public JAXBElement<PersonReferenceType> createPersonReference(PersonReferenceType value) {
        return new JAXBElement<PersonReferenceType>(_PersonReference_QNAME, PersonReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "IscedCode")
    public JAXBElement<String> createIscedCode(String value) {
        return new JAXBElement<String>(_IscedCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Text")
    public JAXBElement<TextType> createText(TextType value) {
        return new JAXBElement<TextType>(_Text_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalizationInclusion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "LocalizationInclusion")
    public JAXBElement<LocalizationInclusion> createLocalizationInclusion(LocalizationInclusion value) {
        return new JAXBElement<LocalizationInclusion>(_LocalizationInclusion_QNAME, LocalizationInclusion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenEndPeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "OpenEndPeriod")
    public JAXBElement<OpenEndPeriodType> createOpenEndPeriod(OpenEndPeriodType value) {
        return new JAXBElement<OpenEndPeriodType>(_OpenEndPeriod_QNAME, OpenEndPeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Identifier")
    public JAXBElement<IdentifierType> createIdentifier(IdentifierType value) {
        return new JAXBElement<IdentifierType>(_Identifier_QNAME, IdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "LanguageCode")
    public JAXBElement<String> createLanguageCode(String value) {
        return new JAXBElement<String>(_LanguageCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionTypeCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "PositionTypeCode")
    public JAXBElement<PositionTypeCodeList> createPositionTypeCode(PositionTypeCodeList value) {
        return new JAXBElement<PositionTypeCodeList>(_PositionTypeCode_QNAME, PositionTypeCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EducationDegreeGrantedStatusCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "EducationDegreeGrantedStatusCode")
    public JAXBElement<EducationDegreeGrantedStatusCodeList> createEducationDegreeGrantedStatusCode(EducationDegreeGrantedStatusCodeList value) {
        return new JAXBElement<EducationDegreeGrantedStatusCodeList>(_EducationDegreeGrantedStatusCode_QNAME, EducationDegreeGrantedStatusCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Patent")
    public JAXBElement<PatentType> createPatent(PatentType value) {
        return new JAXBElement<PatentType>(_Patent_QNAME, PatentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Email")
    public JAXBElement<EmailType> createEmail(EmailType value) {
        return new JAXBElement<EmailType>(_Email_QNAME, EmailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicationTypeCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "PublicationTypeCode")
    public JAXBElement<PublicationTypeCodeList> createPublicationTypeCode(PublicationTypeCodeList value) {
        return new JAXBElement<PublicationTypeCodeList>(_PublicationTypeCode_QNAME, PublicationTypeCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompetencyDimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "CompetencyDimension")
    public JAXBElement<CompetencyDimensionType> createCompetencyDimension(CompetencyDimensionType value) {
        return new JAXBElement<CompetencyDimensionType>(_CompetencyDimension_QNAME, CompetencyDimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmploymentPermitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "EmploymentPermit")
    public JAXBElement<EmploymentPermitType> createEmploymentPermit(EmploymentPermitType value) {
        return new JAXBElement<EmploymentPermitType>(_EmploymentPermit_QNAME, EmploymentPermitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Attachment")
    public JAXBElement<AttachmentType> createAttachment(AttachmentType value) {
        return new JAXBElement<AttachmentType>(_Attachment_QNAME, AttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateOpenEndPeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "DateOpenEndPeriod")
    public JAXBElement<DateOpenEndPeriodType> createDateOpenEndPeriod(DateOpenEndPeriodType value) {
        return new JAXBElement<DateOpenEndPeriodType>(_DateOpenEndPeriod_QNAME, DateOpenEndPeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Score")
    public JAXBElement<ScoreType> createScore(ScoreType value) {
        return new JAXBElement<ScoreType>(_Score_QNAME, ScoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonPhysicalInclusion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "PersonPhysicalInclusion")
    public JAXBElement<PersonPhysicalInclusion> createPersonPhysicalInclusion(PersonPhysicalInclusion value) {
        return new JAXBElement<PersonPhysicalInclusion>(_PersonPhysicalInclusion_QNAME, PersonPhysicalInclusion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseHistoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "BaseHistory")
    public JAXBElement<BaseHistoryType> createBaseHistory(BaseHistoryType value) {
        return new JAXBElement<BaseHistoryType>(_BaseHistory_QNAME, BaseHistoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatePeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "DatePeriod")
    public JAXBElement<DatePeriodType> createDatePeriod(DatePeriodType value) {
        return new JAXBElement<DatePeriodType>(_DatePeriod_QNAME, DatePeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataProtectionPolicyInclusion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "DataProtectionPolicyInclusion")
    public JAXBElement<DataProtectionPolicyInclusion> createDataProtectionPolicyInclusion(DataProtectionPolicyInclusion value) {
        return new JAXBElement<DataProtectionPolicyInclusion>(_DataProtectionPolicyInclusion_QNAME, DataProtectionPolicyInclusion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenderCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "GenderCode")
    public JAXBElement<GenderCodeList> createGenderCode(GenderCodeList value) {
        return new JAXBElement<GenderCodeList>(_GenderCode_QNAME, GenderCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CandidateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Candidate")
    public JAXBElement<CandidateType> createCandidate(CandidateType value) {
        return new JAXBElement<CandidateType>(_Candidate_QNAME, CandidateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Duration")
    public JAXBElement<String> createDuration(String value) {
        return new JAXBElement<String>(_Duration_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Period")
    public JAXBElement<PeriodType> createPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_Period_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearMonthPeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "YearMonthPeriod")
    public JAXBElement<YearMonthPeriodType> createYearMonthPeriod(YearMonthPeriodType value) {
        return new JAXBElement<YearMonthPeriodType>(_YearMonthPeriod_QNAME, YearMonthPeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Certification")
    public JAXBElement<CertificationType> createCertification(CertificationType value) {
        return new JAXBElement<CertificationType>(_Certification_QNAME, CertificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemunerationRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "RemunerationRange")
    public JAXBElement<RemunerationRangeType> createRemunerationRange(RemunerationRangeType value) {
        return new JAXBElement<RemunerationRangeType>(_RemunerationRange_QNAME, RemunerationRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "UnitCode")
    public JAXBElement<UnitCodeList> createUnitCode(UnitCodeList value) {
        return new JAXBElement<UnitCodeList>(_UnitCode_QNAME, UnitCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisabilityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Disability")
    public JAXBElement<DisabilityType> createDisability(DisabilityType value) {
        return new JAXBElement<DisabilityType>(_Disability_QNAME, DisabilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Phone")
    public JAXBElement<PhoneType> createPhone(PhoneType value) {
        return new JAXBElement<PhoneType>(_Phone_QNAME, PhoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearPeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "YearPeriod")
    public JAXBElement<YearPeriodType> createYearPeriod(YearPeriodType value) {
        return new JAXBElement<YearPeriodType>(_YearPeriod_QNAME, YearPeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatentStatusCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "PatentStatusCode")
    public JAXBElement<PatentStatusCodeList> createPatentStatusCode(PatentStatusCodeList value) {
        return new JAXBElement<PatentStatusCodeList>(_PatentStatusCode_QNAME, PatentStatusCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Number")
    public JAXBElement<BigDecimal> createNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Number_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "PersonBase")
    public JAXBElement<PersonBaseType> createPersonBase(PersonBaseType value) {
        return new JAXBElement<PersonBaseType>(_PersonBase_QNAME, PersonBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeOpenEndPeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "DateTimeOpenEndPeriod")
    public JAXBElement<DateTimeOpenEndPeriodType> createDateTimeOpenEndPeriod(DateTimeOpenEndPeriodType value) {
        return new JAXBElement<DateTimeOpenEndPeriodType>(_DateTimeOpenEndPeriod_QNAME, DateTimeOpenEndPeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneTypeArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "PhoneArray")
    public JAXBElement<PhoneTypeArray> createPhoneArray(PhoneTypeArray value) {
        return new JAXBElement<PhoneTypeArray>(_PhoneArray_QNAME, PhoneTypeArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkLifeCycleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "WorkLifeCycle")
    public JAXBElement<WorkLifeCycleType> createWorkLifeCycle(WorkLifeCycleType value) {
        return new JAXBElement<WorkLifeCycleType>(_WorkLifeCycle_QNAME, WorkLifeCycleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Relocation")
    public JAXBElement<RelocationType> createRelocation(RelocationType value) {
        return new JAXBElement<RelocationType>(_Relocation_QNAME, RelocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "CountryCode")
    public JAXBElement<CountryCodeList> createCountryCode(CountryCodeList value) {
        return new JAXBElement<CountryCodeList>(_CountryCode_QNAME, CountryCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecifiedPersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "SpecifiedPerson")
    public JAXBElement<SpecifiedPersonType> createSpecifiedPerson(SpecifiedPersonType value) {
        return new JAXBElement<SpecifiedPersonType>(_SpecifiedPerson_QNAME, SpecifiedPersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemunerationPackageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "RemunerationPackage")
    public JAXBElement<RemunerationPackageType> createRemunerationPackage(RemunerationPackageType value) {
        return new JAXBElement<RemunerationPackageType>(_RemunerationPackage_QNAME, RemunerationPackageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Time")
    public JAXBElement<XMLGregorianCalendar> createTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Time_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationAffiliationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "OrganizationAffiliation")
    public JAXBElement<OrganizationAffiliationType> createOrganizationAffiliation(OrganizationAffiliationType value) {
        return new JAXBElement<OrganizationAffiliationType>(_OrganizationAffiliation_QNAME, OrganizationAffiliationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayTypeCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "PayTypeCode")
    public JAXBElement<PayTypeCodeList> createPayTypeCode(PayTypeCodeList value) {
        return new JAXBElement<PayTypeCodeList>(_PayTypeCode_QNAME, PayTypeCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Travel")
    public JAXBElement<TravelType> createTravel(TravelType value) {
        return new JAXBElement<TravelType>(_Travel_QNAME, TravelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearMonthOpenEndPeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "YearMonthOpenEndPeriod")
    public JAXBElement<YearMonthOpenEndPeriodType> createYearMonthOpenEndPeriod(YearMonthOpenEndPeriodType value) {
        return new JAXBElement<YearMonthOpenEndPeriodType>(_YearMonthOpenEndPeriod_QNAME, YearMonthOpenEndPeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayRateIntervalCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "PayRateIntervalCode")
    public JAXBElement<PayRateIntervalCodeList> createPayRateIntervalCode(PayRateIntervalCodeList value) {
        return new JAXBElement<PayRateIntervalCodeList>(_PayRateIntervalCode_QNAME, PayRateIntervalCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Schedule")
    public JAXBElement<ScheduleType> createSchedule(ScheduleType value) {
        return new JAXBElement<ScheduleType>(_Schedule_QNAME, ScheduleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreNumericCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "ScoreNumericCode")
    public JAXBElement<ScoreNumericCodeList> createScoreNumericCode(ScoreNumericCodeList value) {
        return new JAXBElement<ScoreNumericCodeList>(_ScoreNumericCode_QNAME, ScoreNumericCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "YearMonth")
    public JAXBElement<XMLGregorianCalendar> createYearMonth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_YearMonth_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionScheduleTypeCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "PositionScheduleTypeCode")
    public JAXBElement<PositionScheduleTypeCodeList> createPositionScheduleTypeCode(PositionScheduleTypeCodeList value) {
        return new JAXBElement<PositionScheduleTypeCodeList>(_PositionScheduleTypeCode_QNAME, PositionScheduleTypeCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Location")
    public JAXBElement<LocationType> createLocation(LocationType value) {
        return new JAXBElement<LocationType>(_Location_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailTypeArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "EmailArray")
    public JAXBElement<EmailTypeArray> createEmailArray(EmailTypeArray value) {
        return new JAXBElement<EmailTypeArray>(_EmailArray_QNAME, EmailTypeArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "OrganizationReference")
    public JAXBElement<OrganizationReferenceType> createOrganizationReference(OrganizationReferenceType value) {
        return new JAXBElement<OrganizationReferenceType>(_OrganizationReference_QNAME, OrganizationReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompetencyEvidenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "CompetencyEvidence")
    public JAXBElement<CompetencyEvidenceType> createCompetencyEvidence(CompetencyEvidenceType value) {
        return new JAXBElement<CompetencyEvidenceType>(_CompetencyEvidence_QNAME, CompetencyEvidenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "PersonName")
    public JAXBElement<PersonNameType> createPersonName(PersonNameType value) {
        return new JAXBElement<PersonNameType>(_PersonName_QNAME, PersonNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecifiedCompetencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "SpecifiedCompetency")
    public JAXBElement<SpecifiedCompetencyType> createSpecifiedCompetency(SpecifiedCompetencyType value) {
        return new JAXBElement<SpecifiedCompetencyType>(_SpecifiedCompetency_QNAME, SpecifiedCompetencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Comment")
    public JAXBElement<CommentType> createComment(CommentType value) {
        return new JAXBElement<CommentType>(_Comment_QNAME, CommentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationItemInclusion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "CommunicationItemInclusion")
    public JAXBElement<CommunicationItemInclusion> createCommunicationItemInclusion(CommunicationItemInclusion value) {
        return new JAXBElement<CommunicationItemInclusion>(_CommunicationItemInclusion_QNAME, CommunicationItemInclusion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Percent")
    public JAXBElement<BigDecimal> createPercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Percent_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebTypeArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "WebArray")
    public JAXBElement<WebTypeArray> createWebArray(WebTypeArray value) {
        return new JAXBElement<WebTypeArray>(_WebArray_QNAME, WebTypeArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefereeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Referee")
    public JAXBElement<RefereeType> createReferee(RefereeType value) {
        return new JAXBElement<RefereeType>(_Referee_QNAME, RefereeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "ScoreText")
    public JAXBElement<ScoreTextType> createScoreText(ScoreTextType value) {
        return new JAXBElement<ScoreTextType>(_ScoreText_QNAME, ScoreTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Indicator")
    public JAXBElement<Boolean> createIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_Indicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://hropenstandards.org/schema/xml/", name = "Date")
    public JAXBElement<XMLGregorianCalendar> createDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Date_QNAME, XMLGregorianCalendar.class, null, value);
    }

}
