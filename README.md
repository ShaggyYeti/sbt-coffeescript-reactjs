sbt-coffeescript with JSX-files (ReactJS) support.
================

based on [sbt-coffeescript](https://github.com/sbt/sbt-coffeescript)

An SBT plugin to compile [CoffeeScript](http://coffeescript.org/) and [CoffeeScript JSX](https://github.com/jsdf/coffee-react-transform/) sources to JavaScript.

To use this plugin use the addSbtPlugin command within your project's `plugins.sbt` file:

    resolvers += Resolver.url("GitHub repository", url("http://shaggyyeti.github.io/releases"))(Resolver.ivyStylePatterns)

    addSbtPlugin("default" % "sbt-coffeescript-reactjs" % "1.0.1-SNAPSHOT")

Your project's build file also needs to enable sbt-web plugins. For example with build.sbt:

    lazy val root = (project in file(".")).enablePlugins(SbtWeb)

Once configured, any `*.coffee`, `*.litcoffee`, `*.cjx` or `*.cjsx` files placed in `src/main/assets` will be compiled to JavaScript code in `target/web/public`.

Supported settings:

* `sourceMaps` When set, generates sourceMap files. Defaults to `true`.

  `CoffeeScriptKeys.sourceMaps := true`

* `bare` When set, generates JavaScript without the [top-level function safety wrapper](http://coffeescript.org/#lexical-scope). Defaults to `false`.

  `CoffeeScriptKeys.bare := false`

The plugin is built on top of [JavaScript Engine](https://github.com/typesafehub/js-engine) which supports different JavaScript runtimes.


