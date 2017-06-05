# Duct database.redis.carmine

[![Build Status](https://travis-ci.org/duct-framework/database.redis.carmine.svg?branch=master)](https://travis-ci.org/duct-framework/database.redis.carmine)

[Integrant][] methods for connecting to a [Redis][] database via
[Carmine][].

[integrant]: https://github.com/weavejester/integrant
[redis]: https://redis.io/
[carmine]: https://github.com/ptaoussanis/carmine

## Installation

To install, add the following to your project `:dependencies`:

    [duct/database.redis.carmine "0.1.0"]

## Usage

This library provides two things: a `Boundary` record that holds
connection options for Carmine, and a multimethod for
`:duct.database.redis/carmine` that initiates a those options into the
`Boundary`.

```edn
{:duct.database.redis/carmine {:spec {:host "127.0.0.1", :port 6379}}}
```

When you write functions against the Redis database, consider using a
protocol and extending the `Boundary` record. This will allow you to
easily mock or stub out the database using a tool like [Shrubbery][].

[shrubbery]: https://github.com/bguthrie/shrubbery

## License

Copyright © 2017 James Reeves

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
