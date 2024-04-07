package app;

import com.fasterxml.jackson.annotation.JsonProperty;

class Fields {
    private Content content;
    private Author author;
    private Time time;
    private Likes likes;

    public Content getContent() {
        return content;
    }

    public Author getAuthor() {
        return author;
    }

    public Time getTime() {
        return time;
    }

    public Likes getLikes() {
        return likes;
    }

    static class Content {
        @JsonProperty("stringValue")
        private String stringValue;

        public String getStringValue() {
            return stringValue;
        }
    }

    static class Author {
        @JsonProperty("stringValue")
        private String stringValue;

        public String getStringValue() {
            return stringValue;
        }
    }

    static class Time {
        @JsonProperty("timestampValue")
        private String stringValue;

        public String getStringValue() {
            return stringValue;
        }
    }

    static class Likes {
        @JsonProperty("integerValue")
        private int integerValue;

        public int getIntegerValue() {
            return integerValue;
        }
    }

    @Override
    public String toString() {
        return "Fields{" +
                "content=" + content.getStringValue() +
                ", author=" + author.getStringValue() +
                ", time=" + time.getStringValue() +
                ", likes=" + likes.getIntegerValue() +
                '}';
    }
}