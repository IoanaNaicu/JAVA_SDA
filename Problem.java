import com.sun.org.apache.bcel.internal.generic.ARETURN;
import sun.awt.PeerEvent;

public class Problem {
    String myHello(String name) {
        return "Hello " + name + "!";
    }

    void myHello1(String name) {
        System.out.println("Hello " + name + "!");
    }

    String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    String extraEnd(String str) {
        String end = str.substring(str.length() - 2);
        return end + end + end;
    }

    String firstTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }

    String firstHalf(String str) {
        String f1 = str.substring(0, str.length() / 2);
        return f1;
    }

    String withouEnd(String str) {
        String f1 = str.substring(1, str.length() - 1);
        return f1;
    }

    String comboString(String a, String b) {
        String c;
        if (a.length() > b.length()) {
            return c = b + a + b;
        } else {
            return c = a + b + a;
        }
    }

    String nonStart(String a, String b) {
        String c = a.substring(1, a.length()) + b.substring(1, b.length());
        return c;
    }

    String left2(String a) {
        String c = a.substring(2) + a.substring(0, 2);
        return c;

    }

    String right2(String a) {
        String c = a.substring(a.length() - 2, a.length()) + a.substring(0, a.length() - 2);
        return c;
    }

    String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1, str.length());
        }
    }

    String withoutEnd2(String str) {
        if (str.length() > 2) {
            return str.substring(1, str.length() - 1);
        } else {
            return "";
        }
    }

    String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    boolean endsLy(String str) {

        if (str.length() > 1) {
            if (str.substring(str.length() - 2).equals("ly")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    String twoChar(String str, int index) {
        if (index > 0) {
            if (index < str.length() - 1) {
                return str.substring(index, index + 2);
            } else {
                return str.substring(0, 2);
            }
        } else {
            return str.substring(0, 2);
        }
    }

    String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    boolean hasBad(String str) {

        if (str.length() >= 3) {
            if (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    boolean hasBad2(String str) {

        if (str.length() > 3) {
            if (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
                return true;
            } else {
                return false;
            }
        } else if (str.length() == 3) {
            if (str.equals("bad")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@@";
        }
    }

    String lastChars(String a, String b) {
        if (a.length() >= 1 && b.length() >= 1) {
            return a.substring(0, 1) + b.substring(b.length() - 1);
        } else if (a.length() != 0 && b.length() == 0) {
            return a.substring(0, 1) + "@";
        } else if (a.length() == 0 && b.length() != 0) {
            return "@" + b.substring(b.length() - 1);
        } else {
            return "@@";
        }

    }

    String conCat(String a, String b) {
        if (a.length() == 0) {
            return b;
        } else if (b.length() == 0) {
            return a;
        } else if (a.charAt(a.length() - 1) != b.charAt(0)) {
            return a + b;
        } else {
            return a.substring(0, a.length() - 1) + b;
        }
    }

    String lastTwo(String str) {

        if (str.length() > 1) {
            String s = str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
            return s;
        } else {
            return str;
        }

    }

    String seeColor(String str) {
        if (str.length() >= 3) {
            if (str.substring(0, 3).equals("red")) {
                return "red";
            } else if (str.substring(0, 4).equals("blue")) {
                return "blue";
            } else {
                return "";
            }
        } else {
            return "";
        }
    }

//    boolean frontAgain(String str) {
//        if (str.length() > 1) {
//            if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
//                return true;
//            } else {
//                return false;
//            }
//        } else {
//            return false;
//        }
//    }

    boolean frontAgain1(String str) {
        if (str.length() < 2) {
            return false;
        }

        String front = str.substring(0, 2);
        String back = str.substring(str.length() - 2);
        return(front.equals(back));

    }
}
