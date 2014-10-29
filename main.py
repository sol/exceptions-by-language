#!/usr/bin/env python
try:
    print 1 / 0
except ZeroDivisionError, e:
    print "1. Using str():\n\n    ", str(e), "\n"
    print "2. Using repr():\n\n    ", repr(e), "\n"

print "3. Default exception handler:\n"
print 1 / 0
