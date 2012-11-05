begin
  require "r_b_tree"
rescue LoadError
  warn "Couldn't load extension"
end
