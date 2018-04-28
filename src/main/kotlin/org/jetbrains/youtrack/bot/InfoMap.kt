package org.jetbrains.youtrack.bot

val noSubsystemManager = "@sashache"

val subsystemsManagers = mapOf(
        "Android" to "@yan",

        "Backend. JS" to "@bashor",
        "Backend. JVM" to "@udalov",
        "Backend. JVM. Coroutines" to "@ilmir.usmanov",
        "Backend. JVM. Inline" to "@ilmir.usmanov",        
        "Binary Metadata" to "@udalov",        
        
        "Docs" to "@sergey.igushkin",
        "Eclipse Plugin" to "@mikhail.zarechenskiy",
        
        "Frontend" to "@stanislav.erokhin",
        "Frontend. Control-flow analysis" to "@dmitry.savvinov",
        "Frontend. Data-flow analysis" to "@dmitry.savvinov",
        "Frontend. Declarations" to "@dmitry.petrov",
        "Frontend. Lexer & Parser" to "@denis.zharkov",
        "Frontend. Resolution and Inference" to "@mikhail.zarechenskiy",
        "Frontend. Scripting" to "@ilya.chernikov",
        
        "Java Descriptors and Signatures" to "@denis.zharkov",
        "Language design" to "@denis.zharkov",
        "Reflection" to "@udalov",
        "Libraries" to "@ilya.gorbunov",


        "Tools" to "@alexey.tsvetkov",
        "Tools. Android Extensions" to "@yan",
        "Tools. Ant" to "@udalov",
        "Tools. CLI" to "@udalov",
        "Tools. Compiler Plugins" to "@yan",
        "Tools. Dokka" to "@semoro",
        "Tools. Gradle" to "@sergey.igushkin",
        "Tools. Incremental Compile" to "@alexey.tsvetkov",
        "Tools. J2K" to "@semoro",
        "Tools. JPS" to "@alexey.tsvetkov",
        "Tools. Maven" to "@sergey.mashkov",
        "Tools. REPL" to "@yan",
        "Tools. Scripts" to "@ilya.chernikov",
        "Tools. kapt" to "@yan",

        "IDE" to "@alefas",
        "IDE. Android" to "@yan",
        "IDE. Code Insight" to "@alexey.sedunov",
        "IDE. Code Style" to "@nk",
        "IDE. Completion" to "@alefas",
        "IDE. Configuration" to "@alexey.sedunov",
        "IDE. Debugger" to "@yan",
        "IDE. Decompiler" to "@nk",
        "IDE. Editing" to "@alefas",
        "IDE. Folding" to "@nk",
        "IDE. Gradle" to "@sergey.igushkin",
        "IDE. Gradle. Script" to "@nastelaz",
        "IDE. Highlighting" to "@alefas",
        "IDE. Hints" to "@nk",
        "IDE. Import Management" to "@alefas",
        "IDE. Inspections and Intentions" to "@mikhailglukhikh",
        "IDE. JS" to "@alexey.sedunov",
        "IDE. KDoc" to "@semoro",
        "IDE. Libraries" to "@pavel.talanov",
        "IDE. Light Classes" to "@pavel.talanov",
        "IDE. Multiplatform" to "@pavel.talanov",
        "IDE. Native" to "@vyacheslav.karpukhin",
        "IDE. Navigation" to "@nk",
        "IDE. Project View" to "@nk",
        "IDE. REPL" to "@nastelaz",
        "IDE. Refactorings" to "@alexey.sedunov",
        "IDE. Scratch" to "@nastelaz",
        "IDE. Script" to "@nastelaz",
        "IDE. Tests Support" to "@alexey.sedunov",
        "IDE. UAST" to "@nicolay.mitropolsky",
        "IDE. Ultimate" to "@alexey.sedunov",

        "Web Demo" to "@romanbelov",
        "Web Site" to "@romanbelov",
        "Infrastructure" to "@vyacheslav.gerasimov",
        "IR" to "@dmitry.petrov",
        "Native" to "@nikolay.igotti",
        "[No subsystem]" to "@sashache"
)

val nameToNik = mapOf(
        "Alexander Podkhalyuzin" to "@alefas",
        "Aleksandr Gribovich" to "@oucouppnique",
        "Alexander Gorshenev" to "@alexander.gorshenev",
        "Alexander Prendota" to "@alexander.prendota",
        "Alina Dolgikh" to "@alina.dolgikh",
        "Andrey Breslav" to "@abreslav",
        "Anton Bannykh" to "@anton.bannykh",
        "Alexey Sedunov" to "@alexey.sedunov",
        "Sergey Kuks" to "@qx",
        "Sergey Mashkov" to "@sergey.mashkov",
        "Denis Sharypov" to "@den.sharypov",
        "Denis Zharkov" to "@denis.zharkov",
        "Dmitry Petrov" to "@dmitry.petrov",
        "Dmitry Savvinov" to "@dmitry.savvinov",
        "Roman Elizarov" to "@elizarov",
        "Nikolay Krasko" to "@nk",
        "Sergey Igushkin" to "@sergey.igushkin",
        "Hadi Hariri" to "hhariri (@romanbelov)", // todo
        "Igor Chevdar" to "@igor.chevdar",
        "Ilmir Usmanov" to "@ilmir.usmanov",
        "Ilya Chernikov" to "@ilya.chernikov",
        "Ilya Gorbunov" to "@ilya.gorbunov",
        "Ilya Matveev" to "@ilya.matveev",
        "Konstantin Anisimov" to "@konstantin.anisimov",
        "Leonid Startsev" to "@Leonid Startsev",
        "Leonid Stashevsky" to "@leonid.stashevsky",
        "Lilia Abdulina" to "@lilia",
        "Maxim Shafirov" to "max (@stanislav.erokhin)", // todo
        "Michael Bogdanov" to "@max.kammerer",
        "Mikhail Glukhikh" to "@mikhailglukhikh",
        "Natalia Selezneva" to "@nastelaz",
        "Nicolay Mitropolsky" to "@nicolay.mitropolsky",
        "Nikolay Chashnikov" to "nik (@stanislav.erokhin)", // todo
        "Nikolay Igotti" to "@nikolay.igotti",
        "Ilya Ryzhenkov" to "@orangy",
        "Pavel Punegov" to "@Pavel Punegov",
        "Pavel Talanov" to "@pavel.talanov",
        "Roman Belov" to "@romanbelov",
        "Alexander Chernikov" to "@sashache",
        "Semyon Atamas" to "semyon.atamas (@romanbelov)", // todo
        "Sergey Bogolepov" to "@sergey.bogolepov",
        "Leonid Shalupov" to "shalupov (@yole)",
        "Simon Ogorodnik" to "@semoro",
        "Simon Scholz" to "@Simon Scholz",
        "Stanislav Erokhin" to "@stanislav.erokhin",
        "Svetlana Isakova" to "@svtk",
        "Svyatoslav Scherbina" to "@svyatoslav.scherbina",
        "Alexey Tsvetkov" to "@alexey.tsvetkov",
        "Alexander Udalov" to "@udalov",
        "Valentin Kipiatkov" to "@yole",
        "Vyacheslav Karpukhin" to "@vyacheslav.karpukhin",
        "Vasily Levchenko" to "@minamoto",
        "Viktoria Shirunova" to "@viktoria.shirunova",
        "Vyacheslav Gerasimov" to "@vyacheslav.gerasimov",
        "Yan Zhulanow" to "@yan",
        "Dmitry Jemerov" to "@yole",
        "Zalim Bashorov" to "@bashor",
        "Mikhail Zarechenskiy" to "@mikhail.zarechenskiy",
        "Doug Sigelbaum" to "Doug Sigelbaum (@semoro)",  //todo
        "Takeshi Hagikura" to "Takeshi Hagikura (@semoro)", //todo
        "Sean McQuillan" to "Sean McQuillan (@semoro)" //todo
)
