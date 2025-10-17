package Instructor;

public class Subject {
    private String code;
    private String title;


    public String normalizedCode() {
        if (code == null) {
            return null;
        }
        return code.trim().toUpperCase();
    }

    public String properTitle() {
        StringBuilder result = new StringBuilder();
        boolean newWord = true;

        for (char c : title.trim().toCharArray()) {
            if (Character.isWhitespace(c)) {
                if (result.length() > 0 && result.charAt(result.length() - 1) != ' ')
                    result.append(' ');
                newWord = true;
            } else {
                if (newWord) {
                    result.append(Character.toUpperCase(c));
                    newWord = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            }
        }

        return result.toString();
    }


    public boolean isIntroCourse() {

        boolean titleContainsIntro = title != null &&
                title.toLowerCase().contains("intro");
        boolean codeStartsWithIntro = code != null &&
                code.toUpperCase().startsWith("INTRO-");

        return titleContainsIntro || codeStartsWithIntro;
    }

    public String syllabusLine(Instructor instructor) {
        StringBuilder sb = new StringBuilder();
        sb.append(code != null ? code : "").append(" - ")
                .append(title != null ? title : "");

        if (instructor != null) {
            sb.append(" (Instructor: ")
                    .append(instructor.getLastName() != null ? instructor.getLastName() : "")
                    .append(" ")
                    .append(instructor.getFirstName() != null ? instructor.getFirstName() : "")
                    .append(")");
        }

        return sb.toString();
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
}