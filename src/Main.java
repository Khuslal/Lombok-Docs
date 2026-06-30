class Main {
    public static void main(String[] args) {
        /*
        * =========Lombok Annotations============
        *
        * 1. Key Attribute Annotations
        *   @Getter => Generates getters
        *   @Setter => Generates setters
        *
        *   @NonNull => Automatically injects a null-check into the setter & the constructor
        *   @ToString => Generates a toString() method incorporating your class attributes.
        *   @EqualsAndHashCode => Generates equals() & hashcode() methods using your fields.
        *
        * 2. Grouped Annotations
        *   Instead of writing them seperately, you can bundle them together using shortcuts :-
        *
        *       @Data :
        *           A convenient bundle that acts as @ToString, @EqualsAndHashCode,
        *           @Getter on all fields, @Setter on all non-final fields, and
        *           @RequiredArgsConstructor.
        * */
    }
}