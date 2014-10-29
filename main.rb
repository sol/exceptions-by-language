#!/usr/bin/env ruby
begin
  puts "#{1 / 0}"
rescue Exception => e
  puts "1. Using #to_s:\n\n    #{e.to_s}\n\n"
  puts "2. Using #inspect:\n\n    #{e.inspect}\n\n"
end

puts "3. Default exception handler:\n\n"
puts "#{1 / 0}"
