# A simple g8 template for a command line Native app

## How to build

After applying the tempalte using `sbt new`, you can build this app by simply
following the installation instructions for Scala Native on
[Scala Native's website](http://www.scala-native.org/en/latest/user/setup.html).

Then start sbt and run `nativeLink`. This will create a binary named `cmdline-out`
in `target/scala-2.11`. You can directly run it in your terminal.

## What it is

This is a very simple example of command line app compiled with Scala Native. It
allows you to list the files in the current directory:

```
❯ ./cmdline-out
classes
native
cmdline-out
❯ ./cmdline-out -a
.hidden
classes
native
cmdline-out
❯ ./cmdline-out -foo
Error: Unknown option -foo
ls on Native 0.x
Usage: ls [options]

  -a, --all  do not ignore entries starting with .
```

It's extremely limited at the moment. Adding support for more options is a good
exercice to get familiar with Scala Native!
