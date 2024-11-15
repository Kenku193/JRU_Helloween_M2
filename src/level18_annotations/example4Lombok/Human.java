package level18_annotations.example4Lombok;


import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Getter
//@Setter
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Human {

    @NonNull
    String name;
    int age;
}
