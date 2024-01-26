<h1>Share Market Adviser Java Project in Google Cloud </h1>
Share Market Adviser Project is a web-based application designed to provide users with share market advice. Leveraging Google's Cloud technology, this application allows users to access expert share market advice securely and efficiently.

<h1>Overview</h1>
Upon successful login, users can specify their preferences by selecting the types of shares they are interested in monitoring and investing in. Users have access to comprehensive advice related to their chosen shares and can modify their preferences at any time. Removing a preferred share stops advice for that share, while adding a new share begins receiving relevant advice. This dynamic approach tailors the user experience to their evolving interests and investment strategies.

<h1>Setup</h1>
<h2>Tools and Platform</h2>
<ul>
  <li><b>Eclipse or Prefered IDE:</b> Integrated Development Environment (IDE) for Spring-based Java applications.</li>
  <li><b>MySQL Server and MySQL Workbench:</b> Database and visual design tool for managing MySQL databases.</li>
  <li><b>Spring Boot:</b> Framework simplifying the creation of Spring-based applications.</li>
  <li><b>Java 17:</b> Programming language and platform for various applications.</li>
  <li><b>CSS (Cascading Style Sheets):</b> Style sheet language for web document presentation.</li>
  <li><b>HTML (HyperText Markup Language):</b> Markup language for creating web page structure.</li>
  <li><b>Thymeleaf: </b>Server-side Java template engine for web and standalone environments.</li>
  <li><b>JavaScript:</b> Programming language for interactive and dynamic web page content.</li>
  
</ul>
<h2>Cloud Services</h2>
<ul>
  <li><b>Google Authenticator:</b> OAuth 2.0-based authentication for secure user login.</li>
  <li><b>Google Cloud App Engine:</b> Deployment and scalability with PaaS capabilities.</li>
  <li><b>Google Cloud Pub/Sub:</b> Messaging service for asynchronous messaging and real-time communication.</li>
  <li><b>Google Cloud SQL:</b> Relational Database Management using MySQL for storing user details, share information, and subscriptions.</li>

</ul>

<h2>Dependencies</h2>
The sample pom.xml file includes:
<ul>
  <li>Spring Boot Starter Web</li>
   <li>Spring Boot Starter OAuth2 Client</li>
   <li>Spring Boot Starter Thymeleaf</li>
   <li>Spring Boot Starter Data JPA</li>
   <li>MySQL Connector Java</li>
   <li>Lombok</li>
   <li>Spring Cloud GCP Pub/Sub Starter</li>
   <li>Spring Cloud GCP Dependencies</li>
   <li>Spring Cloud GCP Starter SQL MySQL</li>
   </ul>

<h1>Cloud Deployment</h1>
<h2>Cloud SQL Database</h2>
<h3>Open google console and set up the project</h3>
<ul>
  <li>Enable Cloud SQL API</li>
<li>Create a Cloud SQL Instance with MySQL as the database engine</li>
<li>Once the instance is created, create the database.</li>
<li>Modify the application.properties to point to the created database and connection.</li>
<li>spring.cloud.gcp.sql.database-name=<DB_NAME></li>
<li>spring.cloud.gcp.sql.instance-connection-name=</li>
</ul>
<h2>Google Authenticator</h2>
  Create OAuth 2.0 Credentials follows following steps <ul>
    <li>In the API & Services Dashboard, click on "Create Credentials."</li>
    <li>Choose the appropriate credential type, such as "OAuth client ID."</li>
    <li>Configure the OAuth consent screen by providing necessary information.</li>
    <li>Select the application type (web application, mobile app, etc.).</li>
    <li>Configure the authorized redirect URIs if required.</li>
    <li>Click "Create" to generate your OAuth 2.0 client ID and client secret.</li>
    <li>Put Client ID and client Secret in application.yml</li>
  </ul>

<h2>Cloud PubSub Set up</h2>
<h3>Access to Google Cloud Console and choose the project created to enable pubsub</h3>
<ul>
  <li>Enable the Pub/Sub API for that project.</li>
  <li>Create a service account.</li>
<li>Grant Role as Pub/Sub Agent, Pub/Sub Admin, Pub/Sub Publisher and Pub/Sub Subscribers.</li>

</ul>
<h2>Deploy the app to App Engine</h2>
<ol>
  <li><b>Enable App Engine in Google Cloud Console for the project created</b></li>
  <li><b>Go to App Engine and Select Create Application</b></li>
  <li><b>Once the App Engine application is created, deploy the application from local system suing following steps</b>
  <ul>
  <li>Install google cloud sdk on local system**</li>
<li>Open terminal and set up project to deploy**</li>
<li>Initialize using gcloud:** Choose the account and project: gcloud init.</li>
<li>Navigate to the project folder:** Include necessary plugins in pom.xml. Deploy the project to App Engine: gcloud app deploy.</li>
<li>Retrieve application URL:** Use gcloud app browse to get the application URL.</li>
<li>Use gcloud app logs tail -s default to see logs on the terminal.</li>


</ul></li>
</ol>

