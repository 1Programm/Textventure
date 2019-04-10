package com.programm.game.Textventure.objects;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Description {
	
	private String name;
	private String description;

}
