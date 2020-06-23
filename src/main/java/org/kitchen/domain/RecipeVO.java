package org.kitchen.domain;

import java.util.Date;

import lombok.Data;

@Data
public class RecipeVO {
	private long rno;
	private String title;
	private Date regdate;
	private Date updateDate;
	private int cookingTime;
	private String difficulty;
	private long userNo;
	private ContentVO[] contents;
	private String[] material;
	private long[] reviewRecipes;
}
