![alt text][logo]

[logo]: https://github.com/MagnumOpuses/project-meta/blob/master/img/jobtechdev_black.png "JobTech dev logo"

[A JobTech Project](https://www.jobtechdev.se)

# AF Portability

AF Portability is the web service that enables the end-user to extract/export their own CV data Arbetsförmedlingen directly to their personal Gravity storage.

## Versions, current dev state and future

1.0.0-beta

## Getting started

### Docker

spring.profile.url=mock
spring.profile.url=http://af-connect.local:9998/arbetssokandeprofil/rest/af/v1/arbetssokandeprofil/arbetssokandeprofiler
spring.kundgift.url=http://af-connect.local:9998/arbetssokande/rest/af/v1/arbetssokande/externa-personuppgifter

More getting started guidelines.

### Prerequisites

Java version 8 >
and Maven

### Installation

```bash
git clone https://github.com/MagnumOpuses/af-portability.git
cd af-portability
```

## Run

To run the project on different environment:

```bash
mvn spring-boot:run -Dspring.profiles.active=<env_name>
```

Available environment:

1. local = used for local development
2. mock = used for mocking the service

## API Specifications

```bash
1. /profile
GET Request
gets CV data with the help of Cookie added in the header as 'AMV-SSO-COOKIE'

2. /token?api-key=<apikey>
GET Request
gets a session token and the api-key in the query parameter define the authenticity of the user

3. /cv?sessionToken=<sessionToken>
GET Request
gets cv from the outbox using the session token

4. /store
POST Request
Post body = {token: string, value: string}
Here token is the session token and value is CV string.
Stores CV data as string against session token in AF-Connect-Outbox.
Stored value only last for 5 minutes.
```

## Test

No tests yet.

## Deployment

No deployment guidelines yet.

## Built with

No technologies yet.

## Contributing

We would love if you'd like to help us build and improve this product for the benefit of everyone. This project is intended to be a safe, welcoming space for collaboration, and contributors are expected to adhere to the [Contributor Covenant](http://contributor-covenant.org/) code of conduct.

Any contributions, feedback and suggestions are more than welcome.

Please read our guidelines for contribution [here](CONTRIBUTING_TEMPLATE.md).

## License

[Apache License 2.0](LICENSE.md)

## Acknowledgments

No acknowledgments yet.
