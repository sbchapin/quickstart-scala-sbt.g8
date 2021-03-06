# A [Giter8 template](http://www.foundweekends.org/giter8/Combined+Pages.html#Usage) for production-grade scala-sbt starter code [for usage with sbt new](https://www.scala-sbt.org/1.x/docs/sbt-new-and-Templates.html) #

[![Build Status](https://travis-ci.org/sbchapin/quickstart-scala-sbt.g8.svg?branch=master)](https://travis-ci.org/sbchapin/quickstart-scala-sbt.g8)

For more information (quite a lot of information) about what's included in this quickstart, [refer to /src/main/g8/README.md](https://github.com/sbchapin/quickstart-scala-sbt.g8/blob/master/src/main/g8/).

This information will come along with the template, so __you may just want to get on with that__.


# To get started immediately: #

```bash
sbt new sbchapin/quickstart-scala-sbt.g8
```

Execute the preceding `sbt` command wherever you want to start a new scala-sbt project.  **It will create a new folder in your active directory.**

It will ask you three questions:

- `name` - _will be formatted to the correct type in necessary places (META-INF, packages, README...)_
- `organization` - _must be in the reverse-namespace format._
- `package` - _must be in the reverse-namespace format (will default to the last two fields intelligently.)_


## Requires: ##

- `sbt` 1.x or higher (or an older sbt with giter8 plugin configured)
- little-to-no [understanding of giter8 or sbt new](https://www.scala-sbt.org/1.x/docs/sbt-new-and-Templates.html)

# To develop this: #
```bash
# Fork it: (https://blog.scottlowe.org/2015/01/27/using-fork-branch-git-workflow/)
# ...then...
# Get your fork:
git clone git@github.com:{YOUR_NAME_HERE}/quickstart-scala-sbt.g8.git
cd quickstart-scala-sbt.g8
git remote add upstream git@github.com:sbchapin/quickstart-scala-sbt.g8.git

# Test it continuously: (will extract the project then run tests inside extracted project)
sbt ~test

# Change it:
git checkout -b cool-feature-branch
echo 'Sam sucks' >> README.md
git commit -am 'Stating the evident'

# Test it one last time:
sbt test

# Push it:
git push origin cool-feature-branch

# Pull request it:
# https://github.com/sbchapin/quickstart-scala-sbt.g8/pulls
```

## LICENSE ##
This template is distributed without any warranty and dedicated to public domain under the CC0 1.0 Universal (CC0 1.0) Public Domain Dedication license.
