package com.strutsrecipes.antbuild.business;

import java.util.HashMap;

import com.strutsrecipes.antbuild.beans.Element;

public class BusinessFacade {
	static private HashMap elements = new HashMap();

	static {
		elements.put("h", new Element("Hydrogen","H","1","1"));
		elements.put("he",new Element("Helium","He","2","4"));
		elements.put("li",new Element("Lithium","Li","3","7"));
		elements.put("be",new Element("Beryllium","Be","4","9"));
		elements.put("b", new Element("Boron","B","5","11"));
		elements.put("c", new Element("Carbon","C","6","12"));
		elements.put("n", new Element("Nitrogen","N","7","14"));
		elements.put("o", new Element("Oxygen","O","8","16"));
		elements.put("f", new Element("Fluorine","F","9","19"));
		elements.put("ne",new Element("Neon","Ne","10","20"));
		elements.put("na",new Element("Sodium","Na","11","23"));
		elements.put("mg",new Element("Magnesium","Mg","12","24"));
		elements.put("al",new Element("Aluminum","Al","13","27"));
		elements.put("si",new Element("Silicon","Si","14","28"));
		elements.put("p", new Element("Phosphorus","P","15","31"));
		elements.put("s", new Element("Sulfur","S","16","32"));
		elements.put("cl",new Element("Chlorine","Cl","17","35"));
		elements.put("ar",new Element("Argon","Ar","18","40"));
		elements.put("k", new Element("Potassium","K","19","39"));
		elements.put("ca",new Element("Calcium","Ca","20","40"));
		elements.put("sc",new Element("Scandium","Sc","21","45"));
		elements.put("ti",new Element("Titanium","Ti","22","48"));
		elements.put("v", new Element("Vanadium","V","23","51"));
		elements.put("cr",new Element("Chromium","Cr","24","52"));
		elements.put("mn",new Element("Manganese","Mn","25","55"));
		elements.put("fe",new Element("Iron","Fe","26","56"));
		elements.put("co",new Element("Cobalt","Co","27","59"));
		elements.put("ni",new Element("Nickel","Ni","28","59"));
		elements.put("cu",new Element("Copper","Cu","29","64"));
		elements.put("zn",new Element("Zinc","Zn","30","65"));
		elements.put("ga",new Element("Gallium","Ga","31","70"));
		elements.put("ge",new Element("Germanium","Ge","32","73"));
		elements.put("as",new Element("Arsenic","As","33","75"));
		elements.put("se",new Element("Selenium","Se","34","79"));
		elements.put("br",new Element("Bromine","Br","35","80"));
		elements.put("kr",new Element("Krypton","Kr","36","84"));
		elements.put("rb",new Element("Rubidium","Rb","37","85"));
		elements.put("sr",new Element("Strontium","Sr ","38","88"));
		elements.put("y", new Element("Yttrium","Y","39","89"));
		elements.put("zr",new Element("Zirconium","Zr","40","91"));
		elements.put("nb",new Element("Niobium","Nb","41","93"));
		elements.put("mo",new Element("Molybdenum","Mo","42","96"));
		elements.put("tc",new Element("Technetium","Tc","43","98"));
		elements.put("ru",new Element("Ruuthenium","Ru","44","101"));
		elements.put("rh",new Element("Rhodium","Rh","45","103"));
		elements.put("pd",new Element("Palladium","Pd","46","106"));
		elements.put("ag",new Element("Silver","Ag","47","108"));
		elements.put("vd",new Element("Cadmium","Vd","48","112"));
		elements.put("in",new Element("Indium","In","49","115"));
		elements.put("sn",new Element("Tin","Sn","50","119"));
		elements.put("sb",new Element("Antimony","Sb","51","122"));
		elements.put("te",new Element("Tellurium","Te","52","128"));
		elements.put("i", new Element("Iodine","I","53","127"));
		elements.put("xe",new Element("Xenon","Xe","54","131"));
		elements.put("cs",new Element("Cesium","Cs","55","133"));
		elements.put("ba",new Element("Barium","Ba","56","137"));
		elements.put("la",new Element("Lanthanum","La","57","139"));
		elements.put("ce",new Element("Cerium","Ce","58","140"));
		elements.put("pr",new Element("Praseodymium","Pr","59","141"));
		elements.put("nd",new Element("Neodumium","Nd","60","144"));
		elements.put("pm",new Element("Promethium","Pm","61","145"));
		elements.put("sm",new Element("Samarium","Sm","62","150"));
		elements.put("eu",new Element("Europium","Eu","63","152"));
		elements.put("gd",new Element("Gadolinium","Gd","64","157"));
		elements.put("tb",new Element("Terbium","Tb","65","159"));
		elements.put("dy",new Element("Dysprosium","Dy","66","163"));
		elements.put("ho",new Element("Holmium","Ho","67","165"));
		elements.put("er",new Element("Erbium","Er","68","167"));
		elements.put("tm",new Element("Thulium","Tm","69","169"));
		elements.put("yb",new Element("Ytterbium","Yb","70","173"));
		elements.put("lu",new Element("Lutetium","Lu","71","175"));
		elements.put("hf",new Element("Hafnium","Hf","72","178"));
		elements.put("ta",new Element("Tantalum","Ta","73","181"));
		elements.put("w", new Element("Tungsten","W","74","184"));
		elements.put("re",new Element("Rhenium","Re","75","186"));
		elements.put("os",new Element("Osmium","Os","76","190"));
		elements.put("ir",new Element("Iridium","Ir","77","192"));
		elements.put("pt",new Element("Platinum","Pt","78","195"));
		elements.put("au",new Element("Gold","Au","79","197"));
		elements.put("hg",new Element("Mercury","Hg","80","201"));
		elements.put("tl",new Element("Thallium","Tl","81","204"));
		elements.put("pb",new Element("Lead","Pb","82","207"));
		elements.put("bi",new Element("Bismuth","Bi","83","209"));
		elements.put("po",new Element("Polonium","Po","84","209"));
		elements.put("at",new Element("Astatine","At","85","210"));
		elements.put("rn",new Element("Radon","Rn","86","222"));
		elements.put("fr",new Element("Francium","Fr","87","223"));
		elements.put("ra",new Element("Radium","Ra","88","226"));
		elements.put("ac",new Element("Actinium","Ac","89","227"));
		elements.put("th",new Element("Thorium","Th","90","232"));
		elements.put("pa",new Element("Protactnium","Pa","91","231"));
		elements.put("u", new Element("Uranium","U","92","238"));
		elements.put("np",new Element("Neptunium","Np","93","237"));
		elements.put("pu",new Element("Plutonium","Pu","94","244"));
		elements.put("am",new Element("Americium","Am","95","243"));
		elements.put("cm",new Element("Curium","Cm","96","247"));
		elements.put("bk",new Element("Berkelium","Bk","97","247"));
		elements.put("cf",new Element("Californium","Cf","98","251"));
		elements.put("es",new Element("Einsteinium","Es","99","252"));
		elements.put("fm",new Element("Fermium","Fm","100","257"));
		elements.put("md",new Element("Mendelevium","Md","101","258"));
		elements.put("no",new Element("Nobelium","No","102","259"));
		elements.put("lr",new Element("Lawrencium","Lr","103","262"));
		elements.put("rf",new Element("Rutherfordium","Rf","104","261"));
		elements.put("db",new Element("Dubnium","Db","105","262"));
		elements.put("sg",new Element("Seaborgium","Sg","106","266"));
		elements.put("bh",new Element("Bohrium","Bh","107","264"));
		elements.put("hs",new Element("Hassium","Hs","108","277"));
		elements.put("mt",new Element("Meitnerium","Mt","109","268"));

	}

	public BusinessFacade() {
		super();
	}

	public Element getElement(String symbol) {
		return (Element) elements.get(symbol.toLowerCase());
	}
}
