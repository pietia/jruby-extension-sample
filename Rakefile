require "rake"
require "rake/testtask"
require "ant"

task :default => :test

Rake::TestTask.new do |t|
  t.libs << "lib"
  t.pattern = "test/**/*_test.rb"
  t.verbose = false
end

directory "pkg/classes"

desc "Clean up build artifacts"
task :clean do
  rm_rf "pkg/classes"
  rm_rf "lib/*.jar"
end

desc "Build the jar"
task :jar => :compile do
  puts "TODO!"
end

task :package => :jar

