//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package se.arbetsformedlingen.matchning.taxonomy.repository;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;
import se.arbetsformedlingen.matchning.taxonomy.model.TaxonomyConcept;
import se.arbetsformedlingen.matchning.taxonomy.model.Concept.EntityType;

public class Taxonomies {
    private Logger LOGGER = LoggerFactory.getLogger(Taxonomies.class);
    private final String REQUEST_ALL_SKILLS = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllSkills xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllSkills>\n  </soap12:Body>\n</soap12:Envelope>";
    private final String REQUEST_ALL_OCCUPATIONS = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllOccupationNames xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllOccupationNames>\n  </soap12:Body>\n</soap12:Envelope>";
    private final String REQUEST_ALL_GROUPS = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllLocaleGroups xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllLocaleGroups>\n  </soap12:Body>\n</soap12:Envelope>";
    private final String REQUEST_ALL_FIELDS = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllLocaleFields xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllLocaleFields>\n  </soap12:Body>\n</soap12:Envelope>";
    private final String REQUEST_ALL_DRIVERSLICENCE = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllDrivingLicences xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllDrivingLicences>\n  </soap12:Body>\n</soap12:Envelope>";
    private final String REQUEST_ALL_LANGUAGES = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllLanguages xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllLanguages>\n  </soap12:Body>\n</soap12:Envelope>";
    private final String REQUEST_ALL_SUNLEVEL1_LEVELS = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllSUNLevel1 xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllSUNLevel1>\n  </soap12:Body>\n</soap12:Envelope>";
    private final String REQUEST_ALL_SUNLEVEL2_LEVELS = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllSUNLevel2 xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllSUNLevel2>\n  </soap12:Body>\n</soap12:Envelope>";
    private final String REQUEST_ALL_SUNLEVEL3_LEVELS = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllSUNLevel3 xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllSUNLevel3>\n  </soap12:Body>\n</soap12:Envelope>";
    private final String REQUEST_ALL_SUNLEVEL1_FIELDS = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllSUNField1 xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllSUNField1>\n  </soap12:Body>\n</soap12:Envelope>";
    private final String REQUEST_ALL_SUNLEVEL2_FIELDS = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllSUNField2 xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllSUNField2>\n  </soap12:Body>\n</soap12:Envelope>";
    private final String REQUEST_ALL_SUNLEVEL3_FIELDS = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllSUNField3 xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllSUNField3>\n  </soap12:Body>\n</soap12:Envelope>";
    private final String REQUEST_ALL_WAGETYPES = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllWageTypes xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllWageTypes>\n  </soap12:Body>\n</soap12:Envelope>";
    private final String REQUEST_ALL_DURATIONS = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllEmploymentDurations xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllEmploymentDurations>\n  </soap12:Body>\n</soap12:Envelope>";
    private final String REQUEST_ALL_EMPLOYMENT_TYPES = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllEmploymentTypes xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllEmploymentTypes>\n  </soap12:Body>\n</soap12:Envelope>";
    private final String REQUEST_ALL_WORKTIMEEXTENT_TYPES = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllWorkTimeExtents xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllWorkTimeExtents>\n  </soap12:Body>\n</soap12:Envelope>";
    private String TAXONOMY_SOAP_SERVICE_ADDRESS = "http://wstaxonomiservice.ams.se/TaxonomiService.asmx";
    private URL TAXONOMY_SOAP_SERVICE_URL;
    private Map<String, String> soapRequests = new HashMap();
    private Map<EntityType, Map<String, TaxonomyConcept>> entities = new HashMap();

    public Taxonomies() {
        this.setupSoapRequestsMap();

        try {
            this.TAXONOMY_SOAP_SERVICE_URL = new URL(this.TAXONOMY_SOAP_SERVICE_ADDRESS);
            this.loadOrDownloadTaxonomyValues();
            this.createParentRelationships();
        } catch (IOException var2) {
            throw new RuntimeException(var2);
        }
    }

    public TaxonomyConcept getConcept(String id, EntityType type) {
        return this.entities.containsKey(type) ? (TaxonomyConcept)((Map)this.entities.get(type)).get(id) : null;
    }

    public List<TaxonomyConcept> getConcepts(EntityType type, String parent) {
        Set<TaxonomyConcept> concepts = new TreeSet();
        if (this.entities.containsKey(type)) {
            Iterator var4 = ((Map)this.entities.get(type)).values().iterator();

            while(var4.hasNext()) {
                TaxonomyConcept concept = (TaxonomyConcept)var4.next();
                if (parent != null) {
                    if (parent.equalsIgnoreCase(concept.getParentId())) {
                        concepts.add(concept);
                    }
                } else {
                    concepts.add(concept);
                }
            }
        }

        return new ArrayList(concepts);
    }

    public String getConceptLabel(String id, EntityType type) {
        TaxonomyConcept concept = this.getConcept(id, type);
        String label = null;
        if (concept != null) {
            label = concept.getLabel();
        }

        return label;
    }

    public List<String> getConceptChildren(String id, EntityType type) {
        List<String> conceptChildren = new ArrayList();
        if (this.entities.get(type) != null) {
            Iterator var4 = ((Map)this.entities.get(type)).values().iterator();

            while(var4.hasNext()) {
                TaxonomyConcept taxonomyConcept = (TaxonomyConcept)var4.next();
                if (taxonomyConcept.getParentId() != null && taxonomyConcept.getParentId().equals(id)) {
                    conceptChildren.add(taxonomyConcept.getId());
                }
            }
        }

        return conceptChildren;
    }

    private void loadOrDownloadTaxonomyValues() throws IOException {
        Entry endpoint;
        for(Iterator var1 = this.soapRequests.entrySet().iterator(); var1.hasNext(); this.createConcepts((String)endpoint.getKey())) {
            endpoint = (Entry)var1.next();
            if (!this.getBackupFile((String)endpoint.getKey()).exists()) {
                this.LOGGER.info("Backup file \"" + (String)endpoint.getKey() + ".xml\" does not exist. Trying to download it.");
                this.downloadTaxonomyValues((String)endpoint.getKey(), (String)endpoint.getValue());
            } else if (this.LOGGER.isDebugEnabled()) {
                this.LOGGER.debug("Loading " + (String)endpoint.getKey() + ": using cached taxonomy file");
            }
        }

    }

    private void downloadTaxonomyValues(String section, String endpoint) throws IOException {
        HttpURLConnection connection = (HttpURLConnection)this.TAXONOMY_SOAP_SERVICE_URL.openConnection();
        InputStream response = this.performPostRequest(connection, endpoint);
        File file = this.getBackupFile(section);
        FileUtils.copyInputStreamToFile(response, file);
        connection.disconnect();
    }

    private void createParentRelationships() {
        Iterator var1 = ((Map)this.entities.get(EntityType.jobterm)).values().iterator();

        TaxonomyConcept concept;
        while(var1.hasNext()) {
            concept = (TaxonomyConcept)var1.next();
            concept.setParent((TaxonomyConcept)((Map)this.entities.get(EntityType.jobgroup)).get(concept.getParentId()));
        }

        var1 = ((Map)this.entities.get(EntityType.jobgroup)).values().iterator();

        while(var1.hasNext()) {
            concept = (TaxonomyConcept)var1.next();
            concept.setParent((TaxonomyConcept)((Map)this.entities.get(EntityType.jobfield)).get(concept.getParentId()));
        }

    }

    private void createConcepts(String baseFilename) throws IOException {
        File file = this.getBackupFile(baseFilename);
        this.createConcepts((InputStream)FileUtils.openInputStream(file));
    }

    private void createConcepts(InputStream response) throws IOException {
        List<TaxonomyConcept> concepts = this.parseXml(response);

        TaxonomyConcept concept;
        for(Iterator var3 = concepts.iterator(); var3.hasNext(); ((Map)this.entities.get(concept.getType())).put(concept.getId(), concept)) {
            concept = (TaxonomyConcept)var3.next();
            if (!this.entities.containsKey(concept.getType())) {
                this.entities.put(concept.getType(), new HashMap());
            }
        }

    }

    private InputStream performPostRequest(HttpURLConnection connection, String requestString) throws IOException {
        byte[] out = requestString.getBytes(StandardCharsets.UTF_8);
        connection.setConnectTimeout(5000);
        connection.setDoOutput(true);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
        connection.setRequestProperty("Content-Length", String.valueOf(out.length));
        OutputStream os = connection.getOutputStream();
        os.write(out);
        os.flush();
        this.LOGGER.debug("HTTP Response: " + connection.getResponseMessage());
        return connection.getInputStream();
    }

    private List<TaxonomyConcept> parseXml(InputStream stream) throws IOException {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

        List var6;
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            TaxonomySoapHandler handler = new TaxonomySoapHandler();
            saxParser.parse(stream, handler);
            List<TaxonomyConcept> taxList = handler.getTaxonomyConceptList();
            var6 = taxList;
        } catch (SAXException | IOException | ParserConfigurationException var10) {
            var10.printStackTrace();
            throw new RuntimeException(var10);
        } finally {
            stream.close();
        }

        return var6;
    }

    private void setupSoapRequestsMap() {
        this.soapRequests.put("skills", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllSkills xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllSkills>\n  </soap12:Body>\n</soap12:Envelope>");
        this.soapRequests.put("jobfields", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllLocaleFields xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllLocaleFields>\n  </soap12:Body>\n</soap12:Envelope>");
        this.soapRequests.put("jobgroups", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllLocaleGroups xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllLocaleGroups>\n  </soap12:Body>\n</soap12:Envelope>");
        this.soapRequests.put("occupations", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllOccupationNames xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllOccupationNames>\n  </soap12:Body>\n</soap12:Envelope>");
        this.soapRequests.put("driverslicences", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllDrivingLicences xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllDrivingLicences>\n  </soap12:Body>\n</soap12:Envelope>");
        this.soapRequests.put("languages", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllLanguages xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllLanguages>\n  </soap12:Body>\n</soap12:Envelope>");
        this.soapRequests.put("sunlevel1", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllSUNLevel1 xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllSUNLevel1>\n  </soap12:Body>\n</soap12:Envelope>");
        this.soapRequests.put("sunlevel2", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllSUNLevel2 xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllSUNLevel2>\n  </soap12:Body>\n</soap12:Envelope>");
        this.soapRequests.put("sunlevel3", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllSUNLevel3 xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllSUNLevel3>\n  </soap12:Body>\n</soap12:Envelope>");
        this.soapRequests.put("sunfields1", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllSUNField1 xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllSUNField1>\n  </soap12:Body>\n</soap12:Envelope>");
        this.soapRequests.put("sunfields2", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllSUNField2 xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllSUNField2>\n  </soap12:Body>\n</soap12:Envelope>");
        this.soapRequests.put("sunfields3", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllSUNField3 xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllSUNField3>\n  </soap12:Body>\n</soap12:Envelope>");
        this.soapRequests.put("wagetypes", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllWageTypes xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllWageTypes>\n  </soap12:Body>\n</soap12:Envelope>");
        this.soapRequests.put("durations", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllEmploymentDurations xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllEmploymentDurations>\n  </soap12:Body>\n</soap12:Envelope>");
        this.soapRequests.put("employmenttypes", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllEmploymentTypes xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllEmploymentTypes>\n  </soap12:Body>\n</soap12:Envelope>");
        this.soapRequests.put("worktimeextents", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n  <soap12:Body>\n    <GetAllWorkTimeExtents xmlns=\"urn:ams.se:Taxonomy\">\n      <languageId>502</languageId>\n    </GetAllWorkTimeExtents>\n  </soap12:Body>\n</soap12:Envelope>");
    }

    private Path getBackupDir() throws IOException {
        String tmpDir = System.getProperty("se.jobtechdev.tmp");
        Path taxTmpDir = Paths.get(tmpDir, "taxonomycache");

        try {
            Files.createDirectory(taxTmpDir);
        } catch (FileAlreadyExistsException var4) {
        }

        return taxTmpDir;
    }

    private File getBackupFile(String base) throws IOException {
        Path path = Paths.get(this.getBackupDir().toString(), base + ".xml");
        return path.toFile();
    }

    private static String readAsString(InputStream inputStream) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        boolean var3 = false;

        int length;
        while((length = inputStream.read(buffer)) != -1) {
            baos.write(buffer, 0, length);
        }

        return baos.toString("UTF-8");
    }
}
