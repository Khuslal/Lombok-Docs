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
        *
        * 2. Grouped Annotations
        *   Instead of writing them seperately, you can bundle them together using shortcuts :-
        *
        *       @Data :
        *           A convenient bundle that acts as @ToString, @EqualsAndHashCode,
        *           @Getter on all fields, @Setter on all non-final fields, and
        *           @RequiredArgsConstructor.
        *       @Valule :
        *           The immutable equivalent to @Data. It makes all fields private & final, & only generates getters (no setters).
        *
        * 3. Constructor Annotations
        *
        *       @NoArgsConstructor :
        *           Creates an empty constructor.
        *
        *       @RequiredArgsConstructor :
        *           Generates a constructor for all fields marked 'final' or '@NonNull'.
        *
        *       @AllArgsConstructor :
        *           Generates a constructor with parameters for all attributes.
        *
        *
        * ===========Best Practices and Pitfalls=============
        *
        * JPA Entities :
        *   Use @Data with caution on JPA entities with bidirectional relationships.
        *   It can cause infinite loops in toString & hashCode methods.
        *
        * Immutability :
        *   When dealing with unchangable objects, prefer to @Value instead of @Data.
        *
        * */
    }
}