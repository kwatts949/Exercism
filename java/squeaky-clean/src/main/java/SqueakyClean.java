class SqueakyClean {
    static String clean(String identifier) {
        if(!identifier.isEmpty()) {
        identifier = identifier
        .replaceAll(" ", "_")
        .replaceAll("\\p{Cntrl}", "CTRL")
        .replaceAll("-.", String.valueOf(Character.toUpperCase(identifier.charAt(identifier.indexOf("-") + 1))))
        .replaceAll("[α-ω]", "")
        .replaceAll("[^\\p{L}\\p{P}\\p{Z}]", "");
        }
        return identifier;
    }
}