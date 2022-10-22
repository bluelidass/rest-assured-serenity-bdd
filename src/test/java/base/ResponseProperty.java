package base;

public class ResponseProperty {
    public enum Property {
        MESSAGE("message");

        public final String property;

        private Property(String jsonPath) {
            this.property = jsonPath;
        }

        @Override
        public String toString() {
            return this.property;
        }
    }

}
