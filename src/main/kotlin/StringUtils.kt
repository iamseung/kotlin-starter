// 파일 최상단에 유팋 함수를 작성하면
// static 의 용도로 사용 가능
fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}