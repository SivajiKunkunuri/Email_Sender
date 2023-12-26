package in.laptop;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

	/*
	 * @Pattern(regexp = "^[A-Z][a-z 0-9]{7,10}", message =
	 * "name should contains 8 letters")
	 */
	private String name;

	private String email;

//	@Size(min = 4, max = 6, message = "should contain 4 letters")
	private String pswd;

//	@Size(min = 10, max = 10, message = "should contain only digits")
	private String phno;

}
