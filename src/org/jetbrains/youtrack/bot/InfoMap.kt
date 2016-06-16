package org.jetbrains.youtrack.bot

val noSubsystemManager = "@yole"

val subsystemsManagers = mapOf(
        "Front-end" to "@stanislav.erokhin",
        "Front-end. Declarations" to "@dmitry.petrov",
        "Front-end. Resolution and Inference" to "@stanislav.erokhin",
        "Front-end. Control-flow analysis" to "@mikhailglukhikh",
        "Front-end. Lexer & Parser" to "@denis.zharkov",

        "Java Descriptors and Signatures" to "@denis.zharkov",
        "Back-end. JVM" to "@udalov",
        "Back-end. JavaScript" to "@bashor",
        "Language design" to "@abreslav",
        "Reflection" to "@udalov",
        "Binary Metadata" to "@udalov",
        "Libraries" to "@ilya.gorbunov",
        "Android" to "@yan",

        "Tools" to "@alexey.tsvetkov",
        "Tools. Ant" to "@udalov",
        "Tools. Maven" to "@sergey.mashkov",
        "Tools. CLI" to "@udalov",
        "Tools. kapt" to "@yan",
        "Tools. REPL" to "@udalov",
        "Tools. Dokka" to "@yole",
        "Tools. Gradle" to "@alexey.tsvetkov",
        "Tools. J2K" to "@valentin",
        "Docs" to "@yole",
        "Tools. JPS" to "@bashor",

        "IDE" to "@yole",
        "IDE. Completion" to "@valentin",
        "IDE. Edu" to "@romanbelov",
        "IDE. Refactorings" to "@alexey.sedunov",
        "IDE. Inspections and Intentions" to "@valentin",
        "IDE. Debugger" to "@nk",

        "Eclipse Plugin" to "@mikhail.zarechenskiy",
        "Web Demo" to "@romanbelov",
        "Web Site" to "@romanbelov",
        "Infrastructure" to "@yole", // todo
        "[No subsystem]" to "@yole"
)

val nameToNik = mapOf(
        "Alexey Andreev" to "@alexey.andreev",
        "Andrey Breslav" to "@abreslav",
        "Alexey Sedunov" to "@alexey.sedunov",
        "Sergey Mashkov" to "@sergey.mashkov",
        "Denis Zharkov" to "@denis.zharkov",
        "Dmitry Petrov" to "@dmitry.petrov",
        "Nikolay Krasko" to "@nk",
        "Hadi Hariri" to "hhariri (@romanbelov)", // todo
        "Ilya Chernikov" to "@ilya.chernikov",
        "Ilya Gorbunov" to "@ilya.gorbunov",
        "Maxim Shafirov" to "max (@yole)", // todo
        "Michael Bogdanov" to "@max.kammerer",
        "Mikhail Glukhikh" to "@mikhailglukhikh",
        "Natalia Ukhorskaya" to "nastelaz (@nk)", // todo
        "Nikolay Chashnikov" to "nik (@yole)", // todo
        "Vladimir Reshetnikov" to "@vladimir.reshetnikov",
        "Ilya Ryzhenkov" to "@orangy",
        "Pavel Talanov" to "@pavel.talanov",
        "Roman Belov" to "@romanbelov",
        "Alexander Chernikov" to "@sashache",
        "Semyon Atamas" to "semyon.atamas (@romanbelov)", // todo
        "Leonid Shalupov" to "shalupov (@yole)",
        "Stanislav Erokhin" to "@stanislav.erokhin",
        "Svetlana Isakova" to "@svtk",
        "Alexey Tsvetkov" to "@alexey.tsvetkov",
        "Alexander Udalov" to "@udalov",
        "Valentin Kipiatkov" to "@valentin",
        "Yan Zhulanow" to "@yan",
        "Dmitry Jemerov" to "@yole",
        "Zalim Bashorov" to "@bashor",
        "Mikhail Zarechenskiy" to "@mikhail.zarechenskiy"
)