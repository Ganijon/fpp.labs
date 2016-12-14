package lesson6.lab2;

import java.awt.Color;

enum RainbowColors {

	Red(Color.RED, "VITALITY",
			"Red is the color with the longest wavelength, being the nearest visible light to infrared "
					+ "\n in the electromagnetic spectrum. We feel in red - ACTIVITY. "),

	Orange(Color.ORANGE, "CREATIVE ENERGY",
			"Orange combines red and yellow. "
					+ "\n It contains the fiery energy of red with the wisdom and control of yellow. "
					+ "\n Orange is a dynamic energy like red but more thoughtful and controlled."),

	Yellow(Color.YELLOW, "WISDOM",
			"Yellow is naturally associated with the sun itself, "
					+ "\n and so with its life giving and sustaining energy. "
					+ "\n Yellow enriches, lightens and activates many of the systems of the body"),

	Green(Color.GREEN, "LIFE, BALANCE, NATURE",
			"Green is the merging of yellow (mind) and blue (spirit). "
					+ "\n It is located exactly at the point of color balance - midway between red "
					+ "\n and violet on the color spectrum."),

	Blue(Color.BLUE, "SPIRITUALITY",
			"Blue is the color of distance - oceans, skies, the heavens. "
					+ "\n The energy of blue helps us to look beyond the immediate environment, "
					+ "\n expanding our perceptions towards the unknown. "),

	Indigo(new Color(75, 0, 130), "INFINITY",
			"Indigo amplifies the energy of blue in a profound way. "
					+ "\n At a physical level, while blue is calming, indigo is sedating. "
					+ "\n It deepens and turns blue energy inward."),

	Violet(new Color(138, 43, 226), "HIGHEST ELEMENT OF SPIRITUAL MASTERY",
			"Violet is the ray of spiritual mastery. It is the highest and most subtle "
					+ "\n specialization of light, being at the opposite end of the color spectrum to red.");

	RainbowColors(Color color, String meaning, String description) {
		this.color = color;
		this.meaning = meaning;
		this.description = description;
	}

	Color color;
	String meaning;
	String description;
}
