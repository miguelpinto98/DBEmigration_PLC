class WelcomeController < ApplicationController
  def index
    n = 10

    @photos = Photo.order('created_at DESC').limit(n)
    @bios = Biography.order('created_at DESC').limit(n)
    @passports = Passport.order('created_at DESC').limit(n)
  end
end
