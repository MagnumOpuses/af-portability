# Common
**HR Open Standards 4.1.1 Patch, November 2018**

This version contains updates to correct any issues found in the original 4.1 Release.

**Updates:**

General:
- Changed all affected XML samples to use the DateType or DateTimeType with a Z for any PeriodTypes.

Benefits:
- Replaced ScheduledHours with ScheduleHours in most JSON and XML instances.

Common:
- Deprecated ScheduledHours and added ScheduleHours using correct data type in DeploymentType JSON and XSD.

Compensation:
- Corrected code type usage in MatchType.json
- Updated MatchType.XSD to include CodeType for SurveyJobCodeLevel and SurveyJobCodeSpecialty.
- Added Name property to ClientValueProvided within RewardType JSON and XSD.
- Corrected JSON and XML samples to match updated schema.

Recruiting:
- Removed schema reference in JSON samples.
- Improved JSON and XML instances (use pascal code, clean up dates, etc.)

Screening:
- Changed SubjectType.xsd to reference Common Organization rather than redefining it.
- Removed Choice of Person or Organization within SubjectType.xsd.

TimeCard:
- Added Payrate to TimecardItemType in both TimecardType JSON and XSD.
- Added QuantityType and AmountType to AllowanceType in Timecard.XSD.
- Added AmountType to BalanceType in Timecard.XSD.
- Updates JSON and XML samples as needed.


**Notes:**
- The Common and Domain folders must be stored at the same level for references to work correctly.

Any comments related to this release should be posted to the [Implementation Forum](http://hropenstandards.org/groups/implementation-forum/).
