package com.thejoa.boot002.ex;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDto {
	private String name;
	private int age;
}
