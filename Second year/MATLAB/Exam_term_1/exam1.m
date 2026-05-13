% Write a code to count the of vowels and consonants in a given string without using built in functions

str = input("Enter the string: ",'s');
str = [str ' '];
i = 1;
vowel = 0;
consonant = 0;
while str(i) ~= ' '
    if (str(i)=='a'||str(i)=='e'||str(i)=='i'||str(i)=='o'||str(i)=='u'||str(i)=='A'||str(i)=='E'||str(i)=='I'||str(i)=='O'||str(i)=='U')
        vowel = vowel +1;
    else
        consonant = consonant+1;
    end
    i = i+1;
end
disp(vowel);
disp(consonant);