plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
rootProject.name = "p1-introduction-to-kotlin"

include(
    "handson1-latihan",
    "handson2-latihan",
    "handson3-latihan"
)
