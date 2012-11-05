# encoding: utf-8

$:.unshift File.expand_path("../lib", __FILE__)

Gem::Specification.new do |s|
  s.name          = "RBTree"
  s.version       = "0.0.1"
  s.authors       = %w(Piotr Gęga)
  s.email         = %w(pietia@appgrinder.pl)
  s.homepage      = "https://github.com/pietia/rbtree"
  s.summary       = "TODO: summary"
  s.description   = "TODO: description"

  s.files         = `git ls-files app lib`.split("\n")
  s.platform      = Gem::Platform::JAVA
  s.require_paths = %w(lib)
  s.rubyforge_project = "[none]"

  s.add_development_dependency "gem-release"
  s.add_development_dependency "rake"
end
