# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.1.0-beta]

### Added

- HROpen 4.2-1
- Automatic generation of HROpen DTOs
- Builder functions for the needed HROpen classes
- Added Actuator endpoint on separate port (default 9804). Actuator port is intended to be used in internal network, not exposed to the public.
- New endpoint: "/checkCompatability"

### Deprecated

- Old mapping functions
- Some of the output names have been altered
- Removed 'personnummer' to 'legalId' mapping.

## [1.0.0-beta]

### Added

- Added logging features

## [0.0.2]

### Added

- Added CHANGELOG.md

### Fixed

- Fixed http request entity encoding problem upon storing value to af-connect-outbox.
