# Techsenger JediTermFX

| Support the Project! |
|:-------------|
| This project is open-source and free to use, both commercially and non-commercially, which is why we need your help in its development. If you like it, please give it a star ⭐ on GitHub — it helps others discover the project and increases its visibility. You can also contribute, for example, by fixing bugs 🐛 or suggesting improvements 💡 — see [Contributing](#contributing). If you can, financial support 💰 is always appreciated — see [Support Us](#support-us). Thank you for your support! |

## Table of Contents
* [Overview](#overview)
* [Demo](#demo)
* [Features](#features)
* [Terminal Comparison](#comparison)
* [Usage](#usage)
    * [Dependencies](#usage-dependencies)
    * [Hyperlinks](#usage-hyperlinks)
* [Code building](#code-building)
* [Running the Application](#application)
    * [Using Maven](#application-maven)
    * [Using Distro](#application-distro)
* [License](#license)
* [Contributing](#contributing)
* [👉 Support Us](#support-us)

## Overview <a name="overview"></a>

Techsenger JediTermFX is a Terminal Emulator for JavaFX. The project is a result of porting
[JediTerm](https://github.com/JetBrains/jediterm) (commit 8366f2b) from Swing to JavaFX. JediTermFX exclusively
utilizes JavaFX components. Therefore, the Terminal Emulator based on this library can be seamlessly integrated into
any JavaFX application. A detailed comparison of terminal libraries is provided below.

## Demo <a name="demo"></a>

![JediTermFX demo](./demo.gif)

## Features <a name="features"></a>

* Local terminal for Unix, Mac and Windows using Pty4J
* Xterm emulation - passes most of tests from vttest
* Xterm 256 colours
* Scrolling
* Copy/Paste
* Mouse support
* Terminal resizing from client or server side
* Terminal tabs

## Terminal Comparison <a name="comparison"></a>

Terminal      | JediTermFX  | [JediTerm](https://github.com/JetBrains/jediterm)  | [TerminalFX](https://github.com/javaterminal/TerminalFX) |
:-------------|:----------- |:--------------|:--------------|
GUI Library   | JavaFX      | Swing         | JavaFX        |
Main Component| Canvas      | JComponent    | WebView       |
Languages     | Java        | Java, Kotlin  | Java, JS      |
JPMS Support  | Yes         | No            | Yes           |

## Usage <a name="usage"></a>

It is recommended to start working with JediTermFX by studying and running the
[BasicTerminalShellExample](jeditermfx-app/src/main/java/com/techsenger/jeditermfx/app/example/BasicTerminalShellExample.java) class.
This class contains the minimal code needed to launch a terminal in a JavaFX application.

### Dependencies <a name="usage-dependencies"></a>

This project is available on Maven Central:

```
<dependency>
    <groupId>com.techsenger.jeditermfx</groupId>
    <artifactId>jeditermfx-core</artifactId>
    <version>${jeditermfx.version}</version>
</dependency>
<dependency>
    <groupId>com.techsenger.jeditermfx</groupId>
    <artifactId>jeditermfx-ui</artifactId>
    <version>${jeditermfx.version}</version>
</dependency>
```

### Hyperlinks <a name="usage-hyperlinks"></a>

JediTermFX provides a wide range of features when working with links. The `HighlightMode` enumeration specifies multiple
modes of working with links and their colors. In the `ALWAYS` modes, links are always underlined and always clickable.
In the `NEVER` modes, links are never underlined and never clickable. In the `HOVER` modes, links become underlined and
clickable only when hovered over. Now let's clarify the difference between the two types of colors. `CUSTOM` colors
are those set by the JediTermFX user in the getHyperlinkColor() method of the settings. `ORIGINAL` colors are those
offered by the program running in the terminal. Thus, links can use either custom colors or the original text colors.

## Code Building <a name="code-building"></a>

To build the library use standard Git and Maven commands:

    git clone https://github.com/techsenger/jeditermfx
    cd jeditermfx
    mvn clean install

## Running the Application <a name="application"></a>

The project contains a demo application that shows how to use this library. There are two ways to run the application.

### Using Maven <a name="application-maven"></a>

To run application using maven plugin execute the following commands in the root of the project:

    cd jeditermfx-app
    mvn javafx:run

Please note, that debugger settings are in `jeditermfx-app/pom.xml` file.

### Using Distro <a name="application-distro"></a>

After building the project, you will find a distribution archive named `jeditermfx-app-<version>.tar` in the
`jeditermfx-app/target` directory. Extracting this file will allow you to launch the application
using `.sh` or `.bat` scripts depending on your operating system.

## License <a name="license"></a>

JediTermFX is dual-licensed under both the LGPLv3 (found in the LICENSE-LGPL-3.txt file in the root directory) and
Apache 2.0 License (found in the LICENSE-APACHE-2.0.txt file in the root directory). You may select, at your option,
one of the above-listed licenses.

## Contributing <a name="contributing"></a>

We welcome all contributions. You can help by reporting bugs, suggesting improvements, or submitting pull requests
with fixes and new features. If you have any questions, feel free to reach out — we’ll be happy to assist you.

## 👉 Support Us <a name="support-us"></a>

You can support us financially through [GitHub Sponsors](https://github.com/sponsors/techsenger). Your
contribution directly helps us keep our open-source projects active, improve their features, and offer ongoing support.
Besides, we offer multiple sponsorship tiers, with different rewards.



