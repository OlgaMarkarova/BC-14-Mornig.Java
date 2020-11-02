package day34;

import static day07.Logik01.split;

public class String14 {
    public static void main(String[] args) {
        System.out.println("String_14_1");
        //Дан String, вернуть String, в которой для каждого char в оригинале есть два char.
        System.out.println(doubleChar("The"));// →"TThhee"
        System.out.println(doubleChar("AAbb"));// →"AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// →"HHii--TThheerree"
        split();

        System.out.println("String_14_2");
        //Возвращает количество раз, когда String «code» встречается где-либо в данной String,
        //за исключением того,
        //что мы принимаем любую char для «d», поэтому учитываются «cope» и «cooe».
        System.out.println(countCode("aaacodebbb"));// →1
        System.out.println(countCode("codexxcode"));// →2
        System.out.println(countCode("cozexxcope"));// →2
        split();

        System.out.println("String_14_3");
        //Return true if the given string contains a "bob" string,
        //but where the middle 'o' char can be any char.
        //Вернуть true, если данная String содержит String «bob»,
        //но где средний char 'o' может быть любым char.
        System.out.println(bobThere("abcbob"));// →true
        System.out.println(bobThere("b9b"));// →true
        System.out.println(bobThere("bac"));// →false
        split();

        System.out.println("String_14_4");
        //Учитывая String и int n, верните String,
        //состоящую из n повторений последних n char String.
        //Вы можете предположить, что n находится между 0 и длиной String включительно.
        System.out.println(repeatEnd("Hello", 3));// →"llollollo"
        System.out.println(repeatEnd("Hello", 2));// →"lolo"
        System.out.println(repeatEnd("Hello", 1));// →"o"
        split();

        System.out.println("String_14_5");   //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //Дан String, рассмотрим String prefix,
        //состоящую из первых char String n.
        //Встречается ли эта String prefix где-нибудь еще в String?
        //Предположим, что строка не пуста и что n находится в диапазоне 1..str.length ().
        System.out.println(prefixAgain("abXYabc", 1));// → true
        System.out.println(prefixAgain("abXYabc", 2));// → true
        System.out.println(prefixAgain("abXYabc", 3));// → false
        split();

        System.out.println("String_14_6");
        //Возвращает true, если для каждого '*' (звезды) в String,
        //если есть char как непосредственно до, так и после звезды, то они одинаковы.
        System.out.println(sameStarChar("xy*yzz"));// →true
        System.out.println(sameStarChar("xy*zzz"));// →false
        System.out.println(sameStarChar("*xa*az"));// →true
        split();

        System.out.println("String_14_7");
        //Return a version of the given string,
        //where for every star () in the string the star and the chars
        //immediately to its left and right are gone.
        //So "abcd" yields "ad" and "ab**cd" also yields "ad".

        System.out.println(starOut("ab*cd"));// →"ad"
        System.out.println(starOut("ab**cd"));// →"ad"
        System.out.println(starOut("sm*eilly"));// →"silly"
        split();

        System.out.println("String_14_8");
        //Return the number of times that the string "hi"
        //appears anywhere in the given string.
        System.out.println(countHi("abc hi ho"));// →1
        System.out.println(countHi("ABChi hi"));// →2
        System.out.println(countHi("hihi"));// →2
        split();

        System.out.println("String_14_9");
        //Даны две String, верните true, если одна из String появляется в самом конце другой String,
        //игнорируя разницу в верхнем и нижнем регистре
        //(другими словами, вычисление не должно быть «чувствительным к регистру»).
        //Примечание. Str.toLowerCase () возвращает строчную версию String.
        System.out.println(endOther("Hiabc", "abc"));// →true
        System.out.println(endOther("AbC", "HiaBc"));// →true
        System.out.println(endOther("abc", "abXabc"));// →true
        split();

        System.out.println("String_14_10");
        //Мы скажем, что String является xy-сбалансированным,
        // если для всех char 'x' в строке существует char 'y' где-то позже в строке.
        // Таким образом, «xxy» сбалансировано, а «xyx» - нет.
        // Один «y» может уравновесить несколько «x».
        // Вернуть истину, если данная строка сбалансирована по xy.
        System.out.println(xyBalance("aaxbby"));// →true
        System.out.println(xyBalance("aaxbb"));// →false
        System.out.println(xyBalance("yaaxbb"));// →false
        split();

        System.out.println("String_14_11");
        //Даны String и int n, верните String, состоящую из первых n char String,
        //за которыми следуют первые n-1 char String  и т. д. Вы можете предположить,
        //что n находится между 0 и длиной String включительно (т.е. n> = 0 и n <= str.length ()).
        System.out.println(repeatFront("Chocolate", 4));// →"ChocChoChC"
        System.out.println(repeatFront("Chocolate", 3));// →"ChoChC"
        System.out.println(repeatFront("Ice Cream", 2));// →"IcI"
        split();

        System.out.println("String_14_12");
        //Дан String, появляется ли «xyz» в середине String?
        //Чтобы определить середину, мы скажем,
        //что количество char слева и справа от «xyz» должно отличаться не более чем на один.
        System.out.println(xyzMiddle("AAxyzBB"));// →true
        System.out.println(xyzMiddle("AxyzBB"));// →true
        System.out.println(xyzMiddle("AxyzBBB"));// →false
        split();

        System.out.println("String_14_13");
        //Дан String вычислите новую String, переместив первый char после следующих двух char,
        //так что «abc» даст «bca». Повторите этот процесс для каждой последующей группы из 3 char,
        //поэтому "abcdef" дает "bcaefd". Игнорируйте любую группу из менее чем 3 char в конце.
        //System.out.println(oneTwo("abc"));// →"bca"
        //System.out.println(oneTwo("tca"));// →"cat"
        System.out.println(oneTwo("tcagdo"));// →"catdog"
        //System.out.println(oneTwo("tcagdon"));// →"catdog"
        split();

        System.out.println("String_14_14");
        //Given a string and a non-empty word string,
        //return a version of the original String where all chars have been replaced by pluses ("+"),
        //except for appearances of the word string which are preserved unchanged.
        System.out.println(plusOut("12xy34", "xy"));// →"++xy++"
        System.out.println(plusOut("12xy34", "1"));// →"1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy"));// →"++xy++xy+++xy"
        split();

        System.out.println("String_14_15");
        //Верните true, если String «cat» и «dog» встречаются в данной String одинаковое количество раз.
        System.out.println(catDog("catdog"));// →true
        System.out.println(catDog("catcat"));// →false
        System.out.println(catDog("1cat1cadodog"));// →true
        System.out.println(catDog("dogdog"));// →false
        split();

        System.out.println("String_14_16");
        //Верните истину, если данная строка содержит вид «xyz»,
        //где перед xyz не ставится точка (.).
        //Итак, «xxyz» считается, а «x.xyz» - нет.
        System.out.println(xyzThere("abcxyz"));// →true
        System.out.println(xyzThere("abc.xyz"));// →false
        System.out.println(xyzThere("xyz.abc"));// →true
        split();

        System.out.println("String_14_18");
        //Даны две String, word и разделитель sep, вернуть большую String,
        //состоящую из количества вхождений word,
        //разделенных String-разделителем.
        System.out.println(repeatSeparator("Word", "X", 3));// →"WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2));// →"ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1));// →"This"
        split();

        System.out.println("String_14_17");
        //Учитывая две String, a и b, создайте String большего размера,
        //состоящую из первого char a, первого char b, второго char a, второго char b и т. Д.
        //Любые оставшиеся char помещаются в конец результата.
        System.out.println(mixString("abc", "xyz"));// →"axbycz"
        System.out.println(mixString("Hi", "There"));// →"HTihere"
        System.out.println(mixString("xxxx", "There"));// →"xTxhxexre"
        split();

        System.out.println("String_14_19");
        //Сэндвич - это два куска хлеба с чем-то средним.
        //Вернуть String, которая находится между первым и последним появлением «хлеба» в данной String,
        //или вернуть пустую String «», если двух кусков хлеба нет.
        System.out.println(getSandwich("breadjambread"));// →"jam"
        System.out.println(getSandwich("xxbreadjambreadyy"));// →"jam"
        System.out.println(getSandwich("xxbreadyy"));// →""
        //output = input.substring(input.indexOf(index) + index.length(), input.lastIndexOf(index));
        split();

        System.out.println("String_14_20");
        //Ищите шаблоны, такие как «zip» и «zap» в String - length-3,
        //начиная с «z» и заканчивая «p». Возвращает String,
        //в которой для всех таких слов средняя char отсутствует, поэтому «zipXzap» дает «zpXzp».
        System.out.println(zipZap("zipXzap"));// →"zpXzp"
        System.out.println(zipZap("zopzop"));// →"zpzp"
        System.out.println(zipZap("zzzopzop"));// →"zzzpzp"
        split();

        System.out.println("String_14_21");                 //!!!!!!!!!!
        //Даны  String и непустую String word, вернуть String, состоящую из каждого char,
        //непосредственно перед и сразу после каждого появления word в String.
        //Игнорируйте случаи, когда перед word или после него нет char,
        //и char может быть включен дважды, если он находится между двумя word.
        System.out.println(wordEnds("abcXY123XYijk", "XY"));//→"c13i"
        System.out.println(wordEnds("XY123XY", "XY"));// →"13"
        System.out.println(wordEnds("XY1XY", "XY"));//// →"11"
    }

    private static String wordEnds(String str, String word) {
        String result1 = "";
        String result2 = "";
        String output = "";
        int word1 = str.indexOf(word);
        int word2 = str.lastIndexOf(word);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == word.charAt(0) && str.charAt(i + 1) == word.charAt(1)) {
                if (i > 0) {
                    output = output + str.charAt(i - 1);
                }
                if (i < str.length() - 3) {
                    output = output + str.charAt(i + 2);
                }
            }
        }
        return output;
    }/*  result1 = str.substring(word1 - 1, word1)
                    + str.substring(word1 + word.length(), word1 + word.length() + 1);
            result2 = str.substring(word2 - 1, word2)
                    + str.substring(word2 + word.length(), word2
                    + word.length() + 1);
            System.out.println("word1= "+word1 );
            result = result1 + result2;*/

    private static String zipZap(String input) {         // !!! почему, когда все с input, не работает?
        String output = input;
        char z = 'z';
        char p = 'p';
        for (int i = 1; i < output.length() - 1; i++) {
            if (output.charAt(i - 1) == z && output.charAt(i + 1) == p) {
                output = output.substring(0, i) + output.substring(i + 1);
            }
        }

        return output;
    }

    private static String getSandwich(String input) {
        String output = "";
        String index = "bread";
        String jam = "jam";
        if (input.indexOf(index) != input.lastIndexOf(index)) {
            output = input.substring(input.indexOf(index) + index.length(), input.lastIndexOf(index));
        }
        return output;
    }

    private static String mixString(String a, String b) {
        String result1 = "";
        String result2 = "";
        int lengthResult = 0;
        String bigWord = "";

        if (a.length() > b.length()) {
            lengthResult = b.length();
            bigWord = a;
        }
        lengthResult = a.length();
        bigWord = b;
        for (int i = 0; i < lengthResult; i++) {
            result1 = result1 + a.charAt(i) + b.charAt(i);
            result2 = result1 + bigWord.substring(lengthResult);
        }
        return result2;
    }

    private static String repeatSeparator(String word, String sep, int n) {      //!!!!!!!!!!!
        String output = "";
        for (int i = 0; i < n - 1; i++) {
            output += word + sep;
        }
        output += word;
        return output;
    }

    private static boolean xyzThere(String str) {
        String indexX = "xyz";
        String indexXDot = ".xyz";
        if (str.contains(indexXDot)) {
            return false;
        } else if (str.contains(indexX)) {
        }
        return true;
    }

    private static boolean catDog(String input) {
        String a = "cat";
        String b = "dog";
        int count1 = 0;
        int count2 = 0;

        if (input.contains(a) && input.contains(b)) {
            return true;
        /*for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == a.charAt(0) && input.charAt(i + 2) == a.charAt(2)) {
                count1++;
            }
            if (input.charAt(i) == b.charAt(0) && input.charAt(i + 2) == b.charAt(2)) {
                count2++;
            }
            if (count1 == count2) {
                return true;
            }*/
        }
        return false;
    }

    private static String plusOut(String str, String word) {            //!!!!!!!!!!!!!!!!!!!!!
        String output = "";
        String plus = "+";
        int count = 0;
        String input = str;
        for (int i = 0; i < str.length(); i++) {     //0-13
            if (i == input.indexOf(word) + count) {
                output = output + str.substring(i, i + word.length());
                i = i + word.length() - 1; //i=0+(2-1)
                count = count + input.indexOf(word) + word.length();  //count=0+2+2
                input = input.substring(input.indexOf(word) + word.length());
            } else {
                output += plus;
            }

        }
        return output;
    }

    private static String oneTwo(String input) {            //!!!!!!!!!!!!!!!!!!
        String output = "";
        for (int i = 0; i < input.length() - 2; i += 3) {
            output = output + input.substring(i + 1, i + 3) + input.charAt(i);
            System.out.println("output " + output);
            System.out.println("input.substring(i+1, i+3) " + input.substring(i + 1, i + 3));
            System.out.println("input.charAt(i) " + input.charAt(i));
        }
            /*if (input.length() == 3) {
                output = input.substring(1, 3) + input.charAt(0);
            } if (input.length() > 3 && input.length() % 3 == 0) {
                int diferenc = input.length() - output.length();
                String diferencC = input.substring(3);
                output2 = diferencC.substring(1) + diferencC.charAt(0);

                output = (input.substring(1, 3) + input.charAt(0)) + output2;
            }
        //}*/
        return output;
    }

    private static boolean xyzMiddle(String str) {
        String index = "xyz";
        int indexFirstSymbol = str.indexOf(index);
        int indexLastSymbol = indexFirstSymbol + 2;
        int countSymbolBeforeIndex = indexFirstSymbol;
        int countSymbolAfterIndex = str.length() - 1 - indexLastSymbol;
        int differenceBeforeAndAfter = Math.abs(countSymbolBeforeIndex - countSymbolAfterIndex);
        if (differenceBeforeAndAfter <= 1) {
            return true;
        }
        return false;
    }

    private static String repeatFront(String input, int n) {
        String output = "";
        for (int i = n; i > 0; i--) {
            output = output + input.substring(0, i);
        }
        return output;
    }

    private static boolean xyBalance(String str) {              //!!!!!!!!!!!!!!!!!!!!!!
        char balance1 = 'x';
        char balance2 = 'y';
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == balance1) {
                count1++;
            }
            if (str.charAt(i) == balance2 && count1 != 0) {
                count2++;
            }
            if (count1 >= count2 && count2 != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean endOther(String a, String b) {
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        if (a1.endsWith(b1) || b1.endsWith(a1)) {
            return true;
        }
        return false;
    }

    private static int countHi(String str) {
        int count = 0;
        String ecv = "hi";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ecv.charAt(0) && str.charAt(i + 1) == ecv.charAt(1)) {
                count++;
            }
        }
        return count;
    }

    private static String starOut(String str) {
        String output = "";
        char star = '*';

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.indexOf(star) == i && i + 1 == str.lastIndexOf(star)) {
                output = str.substring(0, str.indexOf(star) - 1) + str.substring(str.lastIndexOf(star) + 2);
            } else if (str.indexOf(star) == i) {
                output = str.substring(0, str.indexOf(star) - 1) + str.substring(str.indexOf(star) + 2);
            }
            //output = input.substring(0, input.indexOf(star) - 1) + input.substring(input.lastIndexOf(star) + 2);
        }
        return output;
    }

    private static boolean sameStarChar(String input) {
        char star = '*';
        if (input.charAt(input.lastIndexOf(star) - 1) == input.charAt(input.lastIndexOf(star) + 1)) {
            return true;
        }
        return false;
        //for (int i = 0; i < input.length(); i++) {
        //            if ((i == 0 || i == input.length() - 1) && input.charAt(i) == star) {
        //                return false;
        //            } else if (input.charAt(i) == star
        //                    && input.charAt(i - 1) != input.charAt(i + 1)) {
        //                return false;
        //
        //            }
        //        }
        //        return true;
    }

    private static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        for (int i = n; i < str.length(); i++) {
            if (n + i <= str.length()) {
                if (prefix.equals(str.substring(i, n + i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String repeatEnd(String str, int n) {
        String output = "";
        for (int i = 0; i < n; i++) {
            output = output + str.substring(str.length() - n);
        }
        return output;
    }

    private static boolean bobThere(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    private static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o'
                    && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }


    private static String doubleChar(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            output = output + str.charAt(i) + str.charAt(i);
            //output = output+ str.substring(i,i+1)+str.substring(i,i+1);
        }
        return output;
    }
}
