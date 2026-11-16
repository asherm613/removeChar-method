public static String removeChar(String input, String target) {
int x;
for (x = 0; x < input.length(); x++) {
  if (input.substring(x, x+1).equals(target))
    return input.substring(0 , x) + input.substring(x+1);
  }
  return input;
}
