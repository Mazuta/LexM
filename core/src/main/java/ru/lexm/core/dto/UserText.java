package ru.lexm.core.dto;

/**
 * В этот класс записывается текст и процент понимания от пользователя.
 * 
 * @author Anton Yurchenko
 *
 */
public class UserText extends Dto {

	/**
	 * Версия
	 */
	private static final long serialVersionUID = -1328289548328870857L;

	// текст
	private String text;

	// процент понимания
	private int percent;

	/**
	 * Конструктор по умолчанию
	 */
	public UserText() {
		super();
	}

	/**
	 * Конструктор с параметрами
	 * 
	 * @param text
	 *            {@link String}
	 * @param percent
	 *            int
	 */
	public UserText(String text, int percent) {
		super();
		this.text = text;
		this.percent = percent;
	}

	/**
	 * @return возвращает text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            {@link String} устанавливает text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return возвращает percent
	 */
	public int getPercent() {
		return percent;
	}

	/**
	 * @param percent
	 *            int устанавливает percent
	 */
	public void setPercent(int percent) {
		this.percent = percent;
	}

}
