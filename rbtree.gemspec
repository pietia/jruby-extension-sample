# encoding: utf-8

$:.unshift File.expand_path('../lib', __FILE__)
require 'rbtree/version'

Gem::Specification.new do |s|
  s.name          = "rbtree"
  s.version       = Rbtree::VERSION
  s.authors       = [""]
  s.email         = [""]
  s.homepage      = "https://github.com//rbtree"
  s.summary       = "TODO: summary"
  s.description   = "TODO: description"

  s.files         = `git ls-files app lib`.split("\n")
  s.platform      = Gem::Platform::RUBY
  s.require_paths = ['lib']
  s.rubyforge_project = '[none]'
end
