plugins {
    id("buildlogic.java-application-conventions")
}

dependencies {
    implementation(project(":utilities"))
}

application {
    mainClass = "org.example.app.one.App"
}
