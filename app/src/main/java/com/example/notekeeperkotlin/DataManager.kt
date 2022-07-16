package com.example.notekeeperkotlin
object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeNotes() {
        var note: NoteInfo =
            NoteInfo(
                course = CourseInfo("android_intents", "Android Programming with Intents"),
                "Dynamic intent resolution",
                "Wow, intents allow components to be resolved at runtime"
            )
        notes.add(note)
        note =
            NoteInfo(
                course = CourseInfo("android_async", "Android Async Programming and Services"),
                "Dynamic intent resolution",
                "Wow, intents allow components to be resolved at runtime"
            )
        notes.add(note)
        note =
            NoteInfo(
                course = CourseInfo("java_lang", "Java Fundamentals: The Java Language"),
                "Dynamic intent resolution",
                "Wow, intents allow components to be resolved at runtime"
            )
        notes.add(note)
        note =
            NoteInfo(
                course = CourseInfo("java_core", "Java Fundamentals: The Core Platform"),
                "Dynamic intent resolution",
                "Wow, intents allow components to be resolved at runtime"
            )
        notes.add(note)

    }


    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo("android_async", "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo("java_lang", "Java Fundamentals: The Java Language")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }
}