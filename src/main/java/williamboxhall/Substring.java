package williamboxhall;

public class Substring {
    public boolean isSubstring(String candidate, String source) {
        if (empty(candidate)) {
            return true;
        }
        if (longer(candidate, source)) {
            return false;
        }
        return isSmallerInLarger(candidate, source);
    }

    private boolean isSmallerInLarger(String smaller, String larger) {
        for (int l = 0; l < larger.length();) {
            int s = 0;
            if (smaller.charAt(s) == larger.charAt(l)) {
                do {
                    if (s == smaller.length() - 1) {
                        return true;
                    }
                    s++;
                    l++;
                } while (smaller.charAt(s) == larger.charAt(l));
            } else {
                l++;
            }
        }
        return false;
    }

    private boolean longer(String candidate, String source) {
        return candidate.length() > source.length();
    }

    private boolean empty(String candidate) {
        return candidate.length() == 0;
    }
}
