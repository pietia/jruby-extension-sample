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
  rm_rf "lib/rbtree.jar"
end

desc "Compile the extension"
task :compile => "pkg/classes" do |t|
  ant.javac :srcdir => "ext", :destdir => t.prerequisites.first,
            :source => "1.5", :target => "1.5", :debug => true,
            :classpath => "${java.class.path}:${sun.boot.class.path}"
end

desc "Build the jar"
task :jar => :compile do
  ant.jar :basedir => "pkg/classes", :destfile => "lib/rbtree.jar", :includes => "**/*.class"
end

task :package => :jar

