package eight

class SiteVisit(
        val path: String,
        val duration: Double,
        val os: OS
)

enum class OS {
    WINDOWS,
    LINUX,
    MAC,
    IOS,
    ANDROID
}

val log = listOf(
        SiteVisit("/", 34.0, OS.WINDOWS),
        SiteVisit("/", 22.0, OS.MAC),
        SiteVisit("/", 12.0, OS.WINDOWS),
        SiteVisit("/", 8.0, OS.IOS),
        SiteVisit("/", 16.3, OS.ANDROID)
)

// 重複したコードを関数内に抽出
fun List<SiteVisit>.averageDurationFor(os: OS) =
        filter { it.os == os }
                .map(SiteVisit::duration)
                .average()

val averageMobileDuration = log
        .filter { it.os in setOf(OS.IOS, OS.ANDROID) }
        .map(SiteVisit::duration)
        .average()
