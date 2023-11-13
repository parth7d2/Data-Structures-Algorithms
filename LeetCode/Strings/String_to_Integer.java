package LeetCode.Strings;

public class String_to_Integer {
    public static void main(String[] args) {
        System.out.println(myAtoi("-9223372036854775809"));
        System.out.println((int) 'a' - '0');

        // -16 = ' '
        // -5 = '+'
        // -3 = '-'

    }

    static int myAtoi(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int len = s.length();
        int count = 0;
        long ans = 0L;
        boolean minus = false;
        return healper(s, ans, minus, len, count);
    }

    static int healper(String s, long ans, boolean min, int len, int count) {
        if (s.isEmpty()) {
            if (min) {
                ans *= -1;
            }
            if (ans < Integer.MIN_VALUE) {
                ans = Integer.MIN_VALUE;
            } else if (ans > Integer.MAX_VALUE) {
                ans = Integer.MAX_VALUE;
            }

            return (int) ans;
        }
        int c = s.charAt(0) - '0';

        if (c >= 0 && c <= 9) {
            ans *= 10;
            ans += c;
            count++;
        } else if (c == -3) {
            if (count > 0) {
                if (min) {
                    ans *= -1;
                }
                if (ans < Integer.MIN_VALUE) {
                    ans = Integer.MIN_VALUE;
                } else if (ans > Integer.MAX_VALUE) {
                    ans = Integer.MAX_VALUE;
                }

                return (int) ans;
            }
            if (len == 1) {
                return 0;
            }
            int c1 = s.charAt(1) - '0';
            if (c1 == -5) {
                return 0;
            }else if(c1 == -3){
                if (min) {
                    ans *= -1;
                }
                if (ans < Integer.MIN_VALUE) {
                    ans = Integer.MIN_VALUE;
                } else if (ans > Integer.MAX_VALUE) {
                    ans = Integer.MAX_VALUE;
                }

                return (int) ans;
            }
            min = true;
        } else if (c != -16 && c != -5) {
            if (ans == 0) {
                return 0;
            }
            if (min) {
                ans *= -1;
            }
            if (ans < Integer.MIN_VALUE) {
                ans = Integer.MIN_VALUE;
            } else if (ans > Integer.MAX_VALUE) {
                ans = Integer.MAX_VALUE;
            }

            return (int) ans;
        } else if (c == -5) {
            if (len == 1 && count == 0) {
                return 0;
            }
            if (s.length() > 1) {
                int c1 = s.charAt(1) - '0';
                if (c1 == -3 || c1 == -16 || c1==-5) {
                    if (min) {
                        ans *= -1;
                    }
                    if (ans < Integer.MIN_VALUE) {
                        ans = Integer.MIN_VALUE;
                    } else if (ans > Integer.MAX_VALUE) {
                        ans = Integer.MAX_VALUE;
                    }

                    return (int) ans;
                }
            }
            if(count>0){
                if (min) {
                    ans *= -1;
                }
                if (ans < Integer.MIN_VALUE) {
                    ans = Integer.MIN_VALUE;
                } else if (ans > Integer.MAX_VALUE) {
                    ans = Integer.MAX_VALUE;
                }

                return (int) ans;
            }
        } else if (count > 0 && ans == 0) {
            return 0;
        } else if (count > 0) {
            if (ans == 0) {
                return 0;
            }
            if (min) {
                ans *= -1;
            }
            if (ans < Integer.MIN_VALUE) {
                ans = Integer.MIN_VALUE;
            } else if (ans > Integer.MAX_VALUE) {
                ans = Integer.MAX_VALUE;
            }

            return (int) ans;
        }
        if (!min && ans > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }else if (ans < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return healper(s.substring(1), ans, min, len, count);
    }
}
