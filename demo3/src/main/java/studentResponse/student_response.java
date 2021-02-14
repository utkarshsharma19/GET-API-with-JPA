package studentResponse;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class student_response {
	@JsonIgnore
private long id;
	
@JsonProperty("first_name")
private String firstName;

private String Lastname;

public String getLastname() {
	return Lastname;
}

public void setLastname(String lastname) {
	Lastname = lastname;
}



}
