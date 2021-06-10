
# Use Case 001 for the GetAssessmentsCatalog

This defines a simple
Please refer to the Excel workbook tab "AssessmentCatalogQuery" in the 3.3 specification:
Assessments/org_hr-xml/3_3/Documentation/Assessments_Mapping.xls

A GET should support a query for an AssessmentCatalog:
AssessmentPackage/PackageID
AssessmentPackage/AssessmentApplicability
AssessmentPackage/Administration
AssessmentPackage/AssessmentFulfillment

## Request

### Method and URL
```
GET http://localhost/ap_world/api/assessmentscatalog/packages/id=100001
```
### Headers
```
Accept: application/vnd.hropen.assessmentscatalog.v4+json
Accept-Encoding: gzip, deflate, sdch
Accept-Language: en-US,en;q=0.8,bg;q=0.6
Authorization: Bearer ItKfdA...n-2CJMEcB7
Cache-Control: no-cache
Connection: keep-alive
Host: localhost
Pragma: no-cache
Referer: http://localhost/ap_world/


## Response

### Headers
```
Cache-Control: no-cache
Content-Length: 130755
Content-Type: application/vnd.hropen.assessmentscatalog.v4+json; profile="http://hropenstandards.org/schema/assessments#"
Date: Fri, 21 Aug 2015 08:56:19 GMT
Expires: -1
Pragma: no-cache
Server: Microsoft-IIS/8.5
X-Application: ap_world+
X-AspNet-Version: 4.0.30319
X-Powered-By: ASP.NET
X-Rate-Limit: 5000
X-Rate-Remaining: 4990
X-Rate-Reset: 635757585730544708
```
### Status Code
```
Status Code: 200 OK
```
### Body

Noun

### Notes

- ```Accept``` header is used for media type negotiation to ask API to return value in HROS Asssesments format
- ```Accept-Language``` header is used to convey request to get data in particular language unless user principal has no language preference
- ```Authorization``` header is used for OAuth2 authorization flow using JWT tokens
- ```Content-Type``` response header shows that returned data is in HROS Asssesments format and supplies link to Asssesments JSON Schema, which describes data returned
- ```X-Application``` header identifies party, which supplies the data
- ```X-Rate-*``` headers are used for API throttling in order to prevent abuse
