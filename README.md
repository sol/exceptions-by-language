# Ruby

1. Using `#to_s`:

        divided by 0

2. Using `#inspect`:

        #<ZeroDivisionError: divided by 0>

3. Default exception handler:

        ./main.rb:9:in `/': divided by 0 (ZeroDivisionError)
                from ./main.rb:9:in `<main>'

# Python

1. Using `str()`:

         integer division or modulo by zero

2. Using `repr()`:

         ZeroDivisionError('integer division or modulo by zero',)

3. Default exception handler:

        Traceback (most recent call last):
          File "./main.py", line 9, in <module>
            print 1 / 0
        ZeroDivisionError: integer division or modulo by zero

# Java

1. Using .toString():

        java.lang.ArithmeticException: / by zero

2. Using .getMessage():

        / by zero

3. Default exception handler

        Exception in thread "main" java.lang.ArithmeticException: / by zero
                at Main.main(Main.java:10)
